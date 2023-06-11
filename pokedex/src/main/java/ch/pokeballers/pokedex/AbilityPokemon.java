package ch.pokeballers.pokedex;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AbilityPokemon {
	//Variablen erstellt
	private static final Logger logger = LoggerFactory.getLogger(Ability.class);
	
	private boolean is_hidden;
	private int slot;
	private NamedAPIResource pokemon;

	/**
	 * Konstruktor
	 * @param is_hidden
	 * @param slot
	 * @param pokemon
	 */
	public AbilityPokemon(boolean is_hidden, int slot, NamedAPIResource pokemon) {
		this.is_hidden = is_hidden;
		this.slot = slot;
		this.pokemon = pokemon;
	}
	public AbilityPokemon(){

	}

	// Setter und Getter Methoden für die Obrigen Parameter
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

	// Mit dieser Methode wird die toString Methode überschieben.
	@Override
	public String toString() {
		logger.info("weitere Pokemondaten wurden gesetzt.");
		return "AbilityPokemon{" +
				"is_hidden=" + is_hidden +
				", slot=" + slot +
				", pokemon=" + pokemon +
				'}';
	}
}
