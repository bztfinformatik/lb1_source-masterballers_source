package ch.pokeballers.pokedex;

import java.util.List;

public class PokemonMove {
	//Variablen erstellt
	private NamedAPIResource move;
	private List<PokemonMoveVersion> version_group_details;

	public PokemonMove() {
	}

	public PokemonMove(NamedAPIResource move, List<PokemonMoveVersion> version_group_details) {
		this.move = move;
		this.version_group_details = version_group_details;
	}

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

	@Override
	public String toString() {
		return "PokemonMove{" +
				"move=" + move +
				", version_group_details=" + version_group_details +
				'}';
	}
}
