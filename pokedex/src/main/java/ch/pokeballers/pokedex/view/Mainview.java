package ch.pokeballers.pokedex.view;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.URL;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.StyleSheet;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.StreamResource;
import ch.pokeballers.pokedex.PokemonApi;


@PageTitle("Welcome Trainers!")
@Route(value = "")
@StyleSheet("styles.css")
public class Mainview extends VerticalLayout{
    
    private Image startupimg;
    private Button submit;
    String pokemonname;
    PokemonApi pokemonApi;

    public Mainview(){
        setClassName("main-view"); //css Klassenname
        StreamResource iStreamResource = new StreamResource("startup.png", () -> getClass().getResourceAsStream("/images/startup.png"));

        //Elemente hinzufuegen
        startupimg = new Image(iStreamResource, "startup img");
        submit = new Button("Search the Pokedex");

        //Zentriert die Elemente senkrecht
        VerticalLayout centerLayout = new VerticalLayout();
        centerLayout.setAlignItems(Alignment.CENTER);
        centerLayout.add(startupimg, submit);
        add(centerLayout);

        //Groesse des Bildes startup.png
        startupimg.setHeight("900px");
        
        //
        submit.addClickListener(e -> {
            UI.getCurrent().navigate(Pokedex.class);
        });
    
    }
    

    
}
