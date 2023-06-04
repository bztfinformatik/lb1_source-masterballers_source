package ch.pokeballers.pokedex.view;

    //Imports
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
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
    
    private Header head;
    private TextField searchbar;
    private Button submit;

    public Pokedex(){
        head = new Header();
        searchbar = new TextField("Search the Pokedex");
        submit = new Button("Submit");

        add(head);
        add(searchbar);
        add(submit);
    }
   
}
