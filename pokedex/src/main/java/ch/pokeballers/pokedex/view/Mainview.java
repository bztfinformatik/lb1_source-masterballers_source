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
import com.vaadin.flow.server.StreamResource;

@PageTitle("Welcome Trainers!")
@Route(value = "")
public class Mainview extends VerticalLayout{
    
    private Image startupimg;
    private TextField searchbar;
    private Button submit;

    public Mainview() {

        StreamResource iStreamResource = new StreamResource("masterballhigh.png", () -> getClass().getResourceAsStream("/images/masterballhigh.png"));

        Image startupimg = new Image(iStreamResource, "my img");

        // startupimg = new Image("pokedex/src/main/java/ch/pokeballers/pokedex/view/images/masterballhigh.png", "Startup");
        searchbar = new TextField("Search the Pokedex");
        submit = new Button("Submit");
        
        startupimg.setHeight("100px");
        startupimg.setWidth("100px");
        
        add(startupimg);
        add(searchbar);
        add(submit);
    }
}
