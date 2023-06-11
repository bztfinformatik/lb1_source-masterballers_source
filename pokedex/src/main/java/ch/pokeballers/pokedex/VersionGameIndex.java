package ch.pokeballers.pokedex;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VersionGameIndex {
	//Variablen erstellt
	private static final Logger logger = LoggerFactory.getLogger(Ability.class);
	private int game_index;
	private NamedAPIResource version;

	/**
	 * Konstruktor
	 * @param game_index
	 * @param version
	 */
	public VersionGameIndex(int game_index, NamedAPIResource version) {
		this.game_index = game_index;
		this.version = version;
	}

	public VersionGameIndex(){

	}

	// Setter und Getter Methoden für die Obrigen Parameter
	public int getGame_index() {
		return game_index;
	}

	public void setGame_index(int game_index) {
		this.game_index = game_index;
	}

	public NamedAPIResource getVersion() {
		return version;
	}

	public void setVersion(NamedAPIResource version) {
		this.version = version;
	}

	// Mit dieser Methode wird die toString Methode überschieben.
	@Override
	public String toString() {
		logger.info("weitere Pokemondaten (Index) wurden gesetzt.");
		return "VersionGameIndex{" +
				"game_index=" + game_index +
				", version=" + version +
				'}';
	}
}
