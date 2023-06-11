package ch.pokeballers.pokedex;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PokemonStat {
	//Variablen erstellt
	private static final Logger logger = LoggerFactory.getLogger(Ability.class);
	private NamedAPIResource stat;
	private int effort;
	private int base_stat;

	
	/**
	 * Konstruktor
	 * @param stat
	 * @param effort
	 * @param base_stat
	 */
	public PokemonStat(NamedAPIResource stat, int effort, int base_stat) {
		this.stat = stat;
		this.effort = effort;
		this.base_stat = base_stat;
	}

	public PokemonStat() {
	}

	// Setter und Getter Methoden für die Obrigen Parameter
	public NamedAPIResource getStat() {
		return stat;
	}

	public void setStat(NamedAPIResource stat) {
		this.stat = stat;
	}

	public int getEffort() {
		return effort;
	}

	public void setEffort(int effort) {
		this.effort = effort;
	}

	public int getBase_stat() {
		return base_stat;
	}

	public void setBase_stat(int base_stat) {
		this.base_stat = base_stat;
	}

	// Mit dieser Methode wird die toString Methode überschieben.
	@Override
	public String toString() {
		logger.info("weitere Pokemondaten (Stats) wurden gesetzt.");
		return "PokemonStat{" +
				"stat=" + stat +
				", effort=" + effort +
				", base_stat=" + base_stat +
				'}';
	}
}
