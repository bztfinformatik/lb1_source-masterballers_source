package ch.pokeballers.pokedex;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Description {
	private static final Logger logger = LoggerFactory.getLogger(Ability.class);

	private String description;
	private NamedAPIResource language;

	/**
	 * Konstruktor
	 * @param description
	 * @param language
	 */
	public Description(String description, NamedAPIResource language) {
		this.description = description;
		this.language = language;
	}

	public Description(){

	}

	// Setter und Getter Methoden für die Obrigen Parameter
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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
		logger.info("weitere Pokemondaten wurden gesetzt.");
		return "Description{" +
				"description='" + description + '\'' +
				", language=" + language +
				'}';
	}
}
