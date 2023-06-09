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
import ch.pokeballers.pokedex.PokemonApi;
import ch.pokeballers.pokedex.PokemonMove;
import ch.pokeballers.pokedex.PokemonSprites;

@PageTitle("Pokeweb")
@Route(value = "/pokeweb")
// @StyleSheet("styles.css")
public class Pokedex extends VerticalLayout{
    
    //Variablen erstellt<
    private Image logo;
    private TextField searchbar;
    private Button submit;
    Pokemon pokemon = null;
    PokemonApi pokemonApi;
    PokemonSprites pokemonSprites;
    PokemonMove pokemonMove;

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

        //Wenn der Submit-Buttonn gedrueck wird wird der Wert (!null) in searchText gespeichert und dann von der Pokemon Api abgefragt
        submit.addClickListener(e -> {
            // Speichern der Eingabe in die Variable
            String searchText = searchbar.getValue();
            if (!searchText.isEmpty()) {
                pokemon = PokemonApi.getPokemonDataByName(searchText);
                
            } else {
                Notification.show("Please enter a pokemons name");
            }
        });

        
        if(pokemon != null){
            // Speichern der verschiedenen endpoints
            pokemonSprites = pokemon.getSprites();

            //Sprite wird geholt
            Image spriteimg = new Image(pokemonSprites.getFront_default(), "Pokemon Sprite");

            //verscheidene Datenfelder werden erstellt fuer leftart
            TextField nameField = new TextField();
            nameField.setReadOnly(true);
            nameField.setLabel("Name");
            nameField.setValue(pokemon.getName());

            TextField idField = new TextField();
            idField.setReadOnly(true);
            idField.setLabel("ID");
            idField.setValue(pokemon.getId());

            TextField weightField = new TextField();
            idField.setReadOnly(true);
            idField.setLabel("ID");
            idField.setValue(pokemon.getWeight());

            TextField heightField = new TextField();
            idField.setReadOnly(true);
            idField.setLabel("height");
            idField.setValue(pokemon.getHeight());

            //Textfields und Sprites von leftarticle
            VerticalLayout leftartlayout = new VerticalLayout();
            leftartlayout.setAlignItems(Alignment.CENTER);
            leftartlayout.add(spriteimg, nameField, idField, weightField, heightField);
            

            //verscheidene Datenfelder werden erstellt fuer rightart
            TextField describtion = new TextField();
            nameField.setReadOnly(true);
            nameField.setLabel("Describtion");
            nameField.setValue(pokemon.toString());

            VerticalLayout rightartlayout = new VerticalLayout();
            rightartlayout.setAlignItems(Alignment.CENTER);
            rightartlayout.add(describtion);

            HorizontalLayout allart = new HorizontalLayout();
            allart.setAlignItems(Alignment.CENTER);
            allart.add(leftartlayout, rightartlayout);
            add(allart);
        }
        else{
            Notification.show("Pokemonname is incorrect (Check the official english name)");
        }

        
    }
   
}
