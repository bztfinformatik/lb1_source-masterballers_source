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

@PageTitle("Pokeweb")
@Route(value = "/pokeweb")
public class Pokedex extends VerticalLayout{
    
    private Image logo;
    private TextField searchbar;
    private Button submit;

    public Pokedex(){
        logo = new Image("C:\\pic\\logo.png", "logo");
        searchbar = new TextField("Search the Pokedex");
        submit = new Button("Submit");

        
        add(searchbar);
        add(submit);
        add(logo);
    }
   
}
