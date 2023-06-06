package ch.pokeballers.pokedex.view;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.URL;
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
    
    private static final String pokeapi = "https://pokeapi.co/api/v2/pokemon/";
    private Image startupimg;
    private TextField searchbar;
    private Button submit;
    private String apiURL;
    String pokemon = searchbar.getValue();

    public Mainview() {

        StreamResource iStreamResource = new StreamResource("masterballhigh.png", () -> getClass().getResourceAsStream("/images/masterballhigh.png"));

        startupimg = new Image(iStreamResource, "my img");

        // startupimg = new Image("pokedex/src/main/java/ch/pokeballers/pokedex/view/images/masterballhigh.png", "Startup");
        searchbar = new TextField("Search the Pokedex");
        submit = new Button("Submit");
        
        startupimg.setHeight("100px");
        startupimg.setWidth("100px");
 
        add(startupimg, searchbar, submit);
    }

    
    public void searchPokemon(){
        pokemon = searchbar.getValue();
    
        try {
            pokemon = sendGetRequest(apiURL);
            if (pokemon != null){
                Notification.show(pokemon);
            }
            else{
                Notification.show("Pokemon nicht gefunden.");
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    private String sendGetRequest(String url) throws IOException{
        HttpURLConnection connection = null;
        BufferedReader reader = null;
        StringBuilder response = new StringBuilder();
    
        try{
            URL apiUrl = new URL(url);
            connection = (HttpURLConnection) apiUrl.openConnection();
            connection.setRequestMethod("GET");
    
            reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null){
                response.append(line);
            }
        }
        finally{
            if (connection != null){
                connection.disconnect();
            }
            if (reader != null){
                reader.close();
            }
        }
        return response.toString();
    }

    public void setURL(String apiURL){
        this.apiURL = apiURL;
    }

    public String getURL(){
        return apiURL = pokeapi + pokemon;
    }
}