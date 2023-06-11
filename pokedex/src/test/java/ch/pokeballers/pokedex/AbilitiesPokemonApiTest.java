package ch.pokeballers.pokedex;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AbilitiesPokemonApiTest {

    @Test
    public void testGetPokemonAbilityDataById() {
        int id = 34; // Hyper Cutter
        Ability ability = AbilitiesPokemonApi.getPokemonAbilityDataById(id);
        
        // Schauen, ob der Wert nicht auf null gesetzt ist.
        assertNotNull(ability);
        
        // Schauen, ob die ID wirklich mit dee gewollten Ability-Objekt übereinstimmt.
        assertEquals(id, ability.getId());
        
        // Überprüfen, ob der Name des Ability-Objekts nicht null ist.
        assertNotNull(ability.getName());
    }
    
    @Test
    public void testGetPokemonAbilityDataByName() {
        String name = "levitate";
        Ability ability = AbilitiesPokemonApi.getPokemonAbilityDataByName(name);
        
        // Schauen, ob der Wert nicht auf null gesetzt ist.
        assertNotNull(ability);
        
        // Überprüfen, ob der Name des Ability-Objekts mit dem selbstbestimmten Namen übereinstimmt.
        assertEquals(name, ability.getName());    
    }
    
    @Test
    public void testGetPokemonAbilityDataWithInvalidId() {
        int invalidId = -1;
        Ability ability = AbilitiesPokemonApi.getPokemonAbilityDataById(invalidId);
        
        // Schauen, ob der wert wirklich null ist, da eine ungültige ID gesetzt wurde.
        assertNull(ability);
    }
    
    @Test
    public void testGetPokemonAbilityDataWithInvalidName() {
        String invalidName = "judihui";
        Ability ability = AbilitiesPokemonApi.getPokemonAbilityDataByName(invalidName);
        
        // Schauen, ob der wert wirklich null ist, da eine ungültige Name gesetzt wurde.
        assertNull(ability);
    }
}