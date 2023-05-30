package ch.pokeballers.pokedex.view;

//Imports
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Main")
@Route(value = "/main")
public class Mainview extends VerticalLayout{
    
    private Image startupimg;
    private TextField searchbar;
    private Button submit;

    public Mainview() {

        startupimg = new Image("/lb1_source-masterballers_source/pokedex/images/startup.png", "Startup");
        searchbar = new TextField("Search the Pokedex");
        submit = new Button("Submit");
        
        add(startupimg);
        add(submit);
    }
}
