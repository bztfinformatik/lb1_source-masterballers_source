package ch.pokeballers.pokedex;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Name {
	//Variablen erstellt
	private static final Logger logger = LoggerFactory.getLogger(Ability.class);

	private String name;
	private NamedAPIResource language;

	/**
	 * Konstruktor
	 * @param name
	 * @param language
	 */
	public Name(String name, NamedAPIResource language) {
		this.name = name;
		this.language = language;
	}
	public Name(){

	}

	// Setter und Getter Methoden für die Obrigen Parameter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public NamedAPIResource getLanguage() {
		return language;
	}

	public void setLanguage(NamedAPIResource language) {
		this.language = language;
	}

	// Mit dieser Methode wird die toString Methode überschieben.
	@Override
	public String toString() {
		logger.info("weitere Pokemondaten (Name) wurden gesetzt.");
		return "Name{" +
				"name='" + name + '\'' +
				", language=" + language +
				'}';
	}
}