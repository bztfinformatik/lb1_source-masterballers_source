package ch.pokeballers.pokedex;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

public class PokemonTest {

    @Test
    public void testPokemonConstructorAndGetters() {
        // Erstelle Beispieldaten für ein Pokemon
        int id = 25;
        String name = "Pikachu";
        int baseExperience = 112;
        int height = 4;
        boolean isDefault = true;
        int order = 35;
        int weight = 60;

        // Erstelle Beispieldaten für Abilities
        List<PokemonAbility> abilities = new ArrayList<>();
        abilities.add(weight, null);

        // Erstelle Beispieldaten für Forms
        List<NamedAPIResource> forms = new ArrayList<>();
        forms.add(new NamedAPIResource("pokemon-form", "pikachu"));

        // Erstelle Beispieldaten für Game Indices
        List<VersionGameIndex> gameIndices = new ArrayList<>();
        gameIndices.add(new VersionGameIndex(2, new NamedAPIResource("version", "silver")));

        // Erstelle Beispieldaten für HeldItems
        List<PokemonHeldItem> held_items = new ArrayList<>();
        held_items.add(new PokemonHeldItem(new NamedAPIResource("moon-stone", "https://pokeapi.co/api/v2/item/81/"), null));

        // Erstelle Beispieldaten für Encounters
        // Erstelle Beispieldaten für Moves
        List<PokemonMove> moves = new ArrayList<>();
        moves.add(weight, null);

        // Erstelle Beispieldaten für Species
        NamedAPIResource species = new NamedAPIResource("pokemon-species", "pikachu");

        // Erstelle Beispieldaten für Stats
        List<PokemonStat> stats = new ArrayList<>();
        stats.add(new PokemonStat(new NamedAPIResource("move", "quick-attack"), 6, 5));

        // Erstelle Beispieldaten für Sprites
        PokemonSprites sprites = new PokemonSprites("front_default", "front_shiny", "front_female", "front_shiny_female", "back_default", "back_shiny", "back_female", "back_shiny_female");

        // Erstelle Beispieldaten für Types
        List<PokemonType> types = new ArrayList<>();
        types.add(new PokemonType(2, new NamedAPIResource("type", "electric")));

        // Erstelle ein Pokemon-Objekt mit den Beispieldaten
        Pokemon pokemon = new Pokemon(id, name, baseExperience, height, isDefault, order, weight, abilities, forms, gameIndices, held_items,  null, moves, null, sprites, species, stats, types);
        // Pokemon Konstrukter: public Pokemon(int id, String name, int base_experience, int height, boolean is_default, int order, int weight, List<PokemonAbility> abilities, List<NamedAPIResource> forms, List<VersionGameIndex> game_indices, List<PokemonHeldItem> held_items, String location_area_encounters, List<PokemonMove> moves, List<PokemonTypePast> past_types, PokemonSprites sprites, NamedAPIResource species, List<PokemonStat> stats, List<PokemonType> types)
        // Überprüfen, ob die Getter-Methoden die korrekten Werte zurückgeben
        assertEquals(id, pokemon.getId());
        assertEquals(name, pokemon.getName());
        assertEquals(baseExperience, pokemon.getBase_experience());
        assertEquals(height, pokemon.getHeight());
        assertEquals(isDefault, pokemon.isIs_default());
        assertEquals(order, pokemon.getOrder());
        assertEquals(weight, pokemon.getWeight());
        assertEquals(abilities, pokemon.getAbilities());
        assertEquals(forms, pokemon.getForms());
        assertEquals(gameIndices, pokemon.getGame_indices());
        assertEquals(held_items, pokemon.getHeld_items());
        assertEquals(moves, pokemon.getMoves());
        assertEquals(species, pokemon.getSpecies());
        assertEquals(stats, pokemon.getStats());
        assertEquals(sprites, pokemon.getSprites());
        assertEquals(types, pokemon.getTypes());
    }

    @Test
    public void testPokemonToString() {
        // Erstelle Beispieldaten für ein Pokemon
        int id = 25;
        String name = "Pikachu";
        int baseExperience = 112;
        int height = 4;
        boolean isDefault = true;
        int order = 35;
        int weight = 60;

        // Erstelle ein Pokemon-Objekt mit den Beispieldaten
        Pokemon pokemon = new Pokemon(id, name, baseExperience, height, isDefault, order, weight, null,null, null, null, null, null, null, null, null, null, null);

        // Überprüfen, ob die toString-Methode das erwartete Format zurückgibt
        String expectedToString = "Pokemon{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", base_experience=" + baseExperience +
                ", height=" + height +
                ", is_default=" + isDefault +
                ", order=" + order +
                ", weight=" + weight +
                ", abilities=null" +
                ", forms=null" +
                ", game_indices=null" +
                ", location_area_encounters=null" +
                ", moves=null" +
                ", sprites=null" +
                ", species=null" +
                ", stats=null" +
                ", types=null" +
                '}';
        assertEquals(expectedToString, pokemon.toString());
    }
}
