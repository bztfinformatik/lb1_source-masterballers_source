package ch.pokeballers.pokedex;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AbilityFlavorText {
	private static final Logger logger = LoggerFactory.getLogger(Ability.class);


	private String flavor_text;
	private NamedAPIResource language;
	private NamedAPIResource version_group;


	/**
	 * Konstruktor
	 * @param flavor_text
	 * @param language
	 * @param version_group
	 */
	public AbilityFlavorText(String flavor_text, NamedAPIResource language, NamedAPIResource version_group) {
		this.flavor_text = flavor_text;
		this.language = language;
		this.version_group = version_group;
	}

	public AbilityFlavorText(){

	}

	// Setter und Getter Methoden für die Obrigen Parameter
	public String getFlavor_text() {
		return flavor_text;
	}

	public void setFlavor_text(String flavor_text) {
		this.flavor_text = flavor_text;
	}

	public NamedAPIResource getLanguage() {
		return language;
	}

	public void setLanguage(NamedAPIResource language) {
		this.language = language;
	}

	public NamedAPIResource getVersion_group() {
		return version_group;
	}

	public void setVersion_group(NamedAPIResource version_group) {
		this.version_group = version_group;
	}

	// Mit dieser Methode wird die toString Methode überschieben.
	@Override
	public String toString() {
		logger.info("weitere Fähigkeitsdaten wurden gesetzt. ");
		return "AbilityFlavorText{" +
				"flavor_text='" + flavor_text + '\'' +
				", language=" + language +
				", version_group=" + version_group +
				'}';
	}
}
