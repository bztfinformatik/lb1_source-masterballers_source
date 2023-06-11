package ch.pokeballers.pokedex.view;

    
//Imports
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.StyleSheet;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Header;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.StreamResource;

import ch.pokeballers.pokedex.Pokemon;
import ch.pokeballers.pokedex.PokemonSprites;

@PageTitle("Pokeweb")
@Route(value = "/pokeweb")
@StyleSheet("styles.css")
public class Pokedex extends VerticalLayout{
    
    private Image logo;
    private TextField searchbar;
    private Button submit;
    Pokemon pokemon;

    public Pokedex(){
        setClassName("pokeweb-view"); //css Klassenname

        //Header von PokewebView
        //Stream-Ressource aus dem resources Ordner logo.png
        StreamResource iStreamResource1 = new StreamResource("logo.png", () -> getClass().getResourceAsStream("/images/logo.png"));

        //Elemente Logo, Suchfeld und Submitbutton erstellt
        logo = new Image(iStreamResource1, "mberslogo");
        searchbar = new TextField("Search the Pokedex");
        submit = new Button("Submit");

        //Groesse und Breite des Bildes logo.png
        logo.setHeight("350px");
        logo.setWidth("350px");

        //Header mit Logo und Suchfeld erstellt und ausgerichtet
        HorizontalLayout headerLayout = new HorizontalLayout();
        headerLayout.setAlignItems(Alignment.CENTER);
        headerLayout.add(logo, searchbar, submit);
        headerLayout.getStyle().set("margin-left", "800px");
        add(headerLayout);
        
        //Horizontales Zentrieren der Searchbar im Header
        searchbar.getStyle().set("margin-bottom", "35px");

        //Leftarticle und Sprites von PokewebView
        //Stream-Ressource aus dem resources Ordner logo.png
        String spriteURL = pokemon.fr
        StreamResource iStreamResource2 = new StreamResource(".png", () -> getClass().getResourceAsStream("/images/logo.png"));

        //Elemente erstellt
        logo = new Image(iStreamResource1, "mberslogo");
        TextField disabledField = new TextField();
        disabledField.setEnabled(false);
        disabledField.setLabel("Characteristics");

        
    }
   
}
