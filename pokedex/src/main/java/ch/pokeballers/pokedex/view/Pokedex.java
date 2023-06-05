package ch.pokeballers.pokedex.view;

    
//Imports
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
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

@PageTitle("Pokeweb")
@Route(value = "/pokeweb")
public class Pokedex extends VerticalLayout{
    
    private Image logo;
    private TextField searchbar;
    private Button submit;

    public Pokedex(){


        StreamResource iStreamResource = new StreamResource("logo.png", () -> getClass().getResourceAsStream("/images/logo.png"));


        Image logo = new Image(iStreamResource, "my img");
        searchbar = new TextField("Search the Pokedex");
        submit = new Button("Submit");

        logo.setHeight("200px");
        logo.setWidth("200px");

        
        add(searchbar);
        add(submit);
        add(logo);
    }
   
}
