package ch.pokeballers.pokedex;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PokemonMove {
	//Variablen 
	private static final Logger logger = LoggerFactory.getLogger(Ability.class);
	private NamedAPIResource move;
	private List<PokemonMoveVersion> version_group_details;

	/**
	 * Konstruktor
	 * @param move
	 * @param version_group_details
	 */
	public PokemonMove(NamedAPIResource move, List<PokemonMoveVersion> version_group_details) {
		this.move = move;
		this.version_group_details = version_group_details;
	}

	public PokemonMove() {
	}

	// Setter und Getter Methoden für die Obrigen Parameter
	public NamedAPIResource getMove() {
		return move;
	}

	public void setMove(NamedAPIResource move) {
		this.move = move;
	}

	public List<PokemonMoveVersion> getVersion_group_details() {
		return version_group_details;
	}

	public void setVersion_group_details(List<PokemonMoveVersion> version_group_details) {
		this.version_group_details = version_group_details;
	}

	// Mit dieser Methode wird die toString Methode überschieben.
	@Override
	public String toString() {
		logger.info("weitere Pokemondaten (Moven) wurden gesetzt.");
		return "PokemonMove{" +
				"move=" + move +
				", version_group_details=" + version_group_details +
				'}';
	}
}
