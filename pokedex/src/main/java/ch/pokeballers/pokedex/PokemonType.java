package ch.pokeballers.pokedex;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PokemonType {	
	private static final Logger logger = LoggerFactory.getLogger(Ability.class);
	//Variablen erstellt
	private int slot;
	private NamedAPIResource type;

	

	public PokemonType(int slot, NamedAPIResource type) {
		this.slot = slot;
		this.type = type;
	}

	public PokemonType() {
	}

	// Setter und Getter Methoden für die Obrigen Parameter
	public int getSlot() {
		return slot;
	}

	public void setSlot(int slot) {
		this.slot = slot;
	}

	public NamedAPIResource getType() {
		return type;
	}

	public void setType(NamedAPIResource type) {
		this.type = type;
	}

	// Mit dieser Methode wird die toString Methode überschieben.
	@Override
	public String toString() {
		logger.info("weitere Pokemondaten (Slot) wurden gesetzt.");
		return "PokemonType{" +
				"slot=" + slot +
				", type=" + type +
				'}';
	}
}
