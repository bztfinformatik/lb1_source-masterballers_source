package ch.pokeballers.pokedex.view;

//Imports
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Main")
@Route(value = "/main")
public class Mainview extends HorizontalLayout{
    
    private Image startupimg = new Image("/lb1_source-masterballers_source/pokedex/images/startup.png", "Startup");
    private TextField name;
    private Button sayHello;

    public Mainview() {
        name = new TextField("Your name");
        sayHello = new Button("Say hello");
    
    }
}
