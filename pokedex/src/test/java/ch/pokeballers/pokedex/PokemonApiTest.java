package ch.pokeballers.pokedex;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PokemonApiTest{

    @Test
    public void testGetPokemonDataById(){
        int id = 25; // ID von Pikachu
        Pokemon pokemon = PokemonApi.getPokemonDataById(id);
        
        // Schauen, ob der Wert nicht auf null gesetzt ist.
        assertNotNull(pokemon);
        
        // Schauen, ob die ID wirklich mit dem gewollten Pokemon übereinstimmt.
        assertEquals(id, pokemon.getId());
        
        // Kucken, ob der erwartete Name wirklich mit der API Antwort übereinstimmt.
        assertEquals("Pikachu", pokemon.getName());
    }
    
    @Test
    public void testGetPokemonDataByName(){
        String name = "Pikachu";
        Pokemon pokemon = PokemonApi.getPokemonDataByName(name);
        
        // Schauen, ob der Wert nicht auf null gesetzt ist.
        assertNotNull(pokemon);
        
        // Kucken, ob der erwartete Name wirklich mit der API Antwort übereinstimmt.
        assertEquals(name, pokemon.getName());
    }
    
    @Test
    public void testGetPokemonDataWithInvalidId(){
        int falscheId = -1;
        Pokemon pokemon = PokemonApi.getPokemonDataById(falscheId);
        
        // Schauen, ob der wert wirklich null ist, da eine ungültige ID gesetzt wurde.
        assertNull(pokemon);
    }
    
    @Test
    public void testGetPokemonDataWithInvalidName(){
        String falscherName = "judihui";
        Pokemon pokemon = PokemonApi.getPokemonDataByName(falscherName);
        
        // Schauen, ob der wert wirklich null ist, da eine ungültige Name gesetzt wurde.
        assertNull(pokemon);
    }
}
