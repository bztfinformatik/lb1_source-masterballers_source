package ch.pokeballers.pokedex;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NamedAPIResource {
	private static final Logger logger = LoggerFactory.getLogger(Ability.class);

	//Variablen erstellt
	private String name;
	private String url;

	/**
	 * Konstruktor
	 * @param name
	 * @param url
	 */
	public NamedAPIResource(String name, String url) {
		this.name = name;
		this.url = url;
	}
	public NamedAPIResource(){

	}

	// Setter und Getter Methoden für die Obrigen Parameter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	// Mit dieser Methode wird die toString Methode überschieben.
	@Override
	public String toString() {
		logger.info("weitere Pokemondaten wurden gesetzt.");
		return "NamedAPIResource{" +
				"name='" + name + '\'' +
				", url='" + url + '\'' +
				'}';
	}
}
