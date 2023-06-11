package ch.pokeballers.pokedex;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NameTest {

    @Test
    public void testNameConstructorAndGetters() {
        // Erstellung der Testdaten
        String name = "Pikachu";
        NamedAPIResource language = new NamedAPIResource("language", "en");

        // Erstellung des Namen aus den obrigen Daten.
        Name nameObject = new Name(name, language);

        // Getter Methoden überprüfen.
        assertEquals(name, nameObject.getName());
        assertEquals(language, nameObject.getLanguage());
    }

    @Test
    public void testSetName() {
        // Erstellung eines Namens.
        Name nameObject = new Name();

        // Den Namen neu setzten.
        String newName = "Charizard";
        nameObject.setName(newName);

        // Schauen, ob der Name korrekt gesetzt wurde.
        assertEquals(newName, nameObject.getName());
    }

    @Test
    public void testSetLanguage() {
        // Erstellung eines Namens.
        Name nameObject = new Name();

        // Erstelle ein NamedAPIResource-Objekt für die Sprache
        NamedAPIResource newLanguage = new NamedAPIResource("language", "de");
        nameObject.setLanguage(newLanguage);

        // Überprüfen, ob die Sprache korrekt gesetzt wurde
        assertEquals(newLanguage, nameObject.getLanguage());
    }

    @Test
    public void testToString() {
        // Erstellung eines Namens.
        String name = "Pikachu";
        NamedAPIResource language = new NamedAPIResource("language", "en");

        // Erstellung des Namen aus den obrigen Daten.
        Name nameObject = new Name(name, language);

        // Überprüfen, ob die toString-Methode alles richtig ausgibt.
        String expectedToString = "Name{" +
                "name='" + name + '\'' +
                ", language=" + language +
                '}';
        assertEquals(expectedToString, nameObject.toString());
    }
}
