package ch.pokeballers.pokedex;

import java.util.List;

public class PokemonHeldItem {
    
	private NamedAPIResource item;
	private List<PokemonHeldItemVersion> version_details;

	public PokemonHeldItem() {
	}

	public PokemonHeldItem(NamedAPIResource item, List<PokemonHeldItemVersion> version_details) {
		this.item = item;
		this.version_details = version_details;
	}

	public NamedAPIResource getItem() {
		return item;
	}

	public void setItem(NamedAPIResource item) {
		this.item = item;
	}

	public List<PokemonHeldItemVersion> getVersion_details() {
		return version_details;
	}

	public void setVersion_details(List<PokemonHeldItemVersion> version_details) {
		this.version_details = version_details;
	}

	@Override
	public String toString() {
		return "PokemonHeldItem{" +
				"item=" + item +
				", version_details=" + version_details +
				'}';
	}
}


