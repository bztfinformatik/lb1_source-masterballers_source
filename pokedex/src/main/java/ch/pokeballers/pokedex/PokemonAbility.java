package ch.pokeballers.pokedex;

public class PokemonAbility {

	private boolean is_hidden;
	private int slot;
	private NamedAPIResource ability;


	public PokemonAbility(boolean is_hidden, int slot, NamedAPIResource ability) {
		this.is_hidden = is_hidden;
		this.slot = slot;
		this.ability = ability;
	}

	public PokemonAbility() {
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

	public NamedAPIResource getAbility() {
		return ability;
	}

	public void setAbility(NamedAPIResource ability) {
		this.ability = ability;
	}

	@Override
	public String toString() {
		return "PokemonAbility{" +
				"is_hidden=" + is_hidden +
				", slot=" + slot +
				", ability=" + ability +
				'}';
	}
}
