package ch.pokeballers.pokedex;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PokemonAbility {
	//Variablen erstellt
	private static final Logger logger = LoggerFactory.getLogger(Ability.class);
	
	private boolean is_hidden;
	private int slot;
	private NamedAPIResource ability;

	/**
	 * Konstruktor
	 * @param is_hidden
	 * @param slot
	 * @param ability
	 */
	public PokemonAbility(boolean is_hidden, int slot, NamedAPIResource ability) {
		this.is_hidden = is_hidden;
		this.slot = slot;
		this.ability = ability;
	}

	public PokemonAbility() {
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

	public NamedAPIResource getAbility() {
		return ability;
	}

	public void setAbility(NamedAPIResource ability) {
		this.ability = ability;
	}

	// Mit dieser Methode wird die toString Methode überschieben.
	@Override
	public String toString() {
		logger.info("weitere Pokemondaten wurden gesetzt.");
		return "PokemonAbility{" +
				"is_hidden=" + is_hidden +
				", slot=" + slot +
				", ability=" + ability +
				'}';
	}
}
