package ch.pokeballers.pokedex.view;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.URL;
import com.vaadin.flow.component.Key;
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
    
    private static final String pokeapi = "https://pokeapi.co/api/v2/pokemon/";
    private Image startupimg;
    private TextField searchbar;
    private Button submit;
    private String apiURL;
    String pokemonname;
    PokemonApi pokemonApi;

    public Mainview(){
        setClassName("main-view"); //css Klassenname
        StreamResource iStreamResource = new StreamResource("startup.png", () -> getClass().getResourceAsStream("/images/startup.png"));

        //Elemente hinzufuegen
        startupimg = new Image(iStreamResource, "startup img");
        searchbar = new TextField("Search the Pokedex");
        submit = new Button("Submit");

        //Zentriert die Elemente senkrecht
        VerticalLayout centerLayout = new VerticalLayout();
        centerLayout.setAlignItems(Alignment.CENTER);
        centerLayout.add(startupimg, searchbar, submit);
        add(centerLayout);

        //Groesse des Bildes startup.png
        startupimg.setHeight("900px");
        
        //Wenn der Submit-Buttonn gedrueck wird wird der Wert (!null)
        submit.addClickListener(e -> {
            // Speichern der Eingabe in die Variable
            String searchText = searchbar.getValue();
            if (!searchText.isEmpty()) {
                PokemonApi.getPokemonDataByName(searchText);
            } else {
                Notification.show("Please enter a pokemons name");
            }
        });
    
}
    

    /*
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
    } */
    }
