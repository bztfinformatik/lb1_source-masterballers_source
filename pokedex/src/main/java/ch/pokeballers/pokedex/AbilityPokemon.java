package ch.pokeballers.pokedex;

public class AbilityPokemon {
	private boolean is_hidden;
	private int slot;
	private NamedAPIResource pokemon;

	public AbilityPokemon(boolean is_hidden, int slot, NamedAPIResource pokemon) {
		this.is_hidden = is_hidden;
		this.slot = slot;
		this.pokemon = pokemon;
	}
	public AbilityPokemon(){

	}

	public boolean isIs_hidden() {
		return is_hidden;
	}

	public void setIs_hidden(boolean is_hidden) {
		this.is_hidden = is_hidden;
	}

	public int getSlot() {
		return slot;
	}

	public void setSlot(int slot) {
		this.slot = slot;
	}

	public NamedAPIResource getPokemon() {
		return pokemon;
	}

	public void setPokemon(NamedAPIResource pokemon) {
		this.pokemon = pokemon;
	}

	@Override
	public String toString() {
		return "AbilityPokemon{" +
				"is_hidden=" + is_hidden +
				", slot=" + slot +
				", pokemon=" + pokemon +
				'}';
	}
}
