package ch.pokeballers.pokedex;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Effect {
	//Variablen erstellt
	private static final Logger logger = LoggerFactory.getLogger(Ability.class);

	private String effect;
	private NamedAPIResource language;


	/**
	 * Konstruktor
	 * @param effect
	 * @param language
	 */
	public Effect(String effect, NamedAPIResource language) {
		this.effect = effect;
		this.language = language;
	}

	public Effect(){

	}

	// Setter und Getter Methoden für die Obrigen Parameter
	public String getEffect() {
		return effect;
	}

	public void setEffect(String effect) {
		this.effect = effect;
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
		logger.info("weitere Pokemondaten (Effecte) wurden gesetzt.");
		return "Effect{" +
				"effect='" + effect + '\'' +
				", language=" + language +
				'}';
	}
}
