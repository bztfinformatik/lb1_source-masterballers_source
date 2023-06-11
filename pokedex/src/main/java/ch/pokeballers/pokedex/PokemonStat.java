package ch.pokeballers.pokedex;

public class PokemonStat {
	//Variablen erstellt
	private NamedAPIResource stat;
	private int effort;
	private int base_stat;

	public PokemonStat() {
	}

	public PokemonStat(NamedAPIResource stat, int effort, int base_stat) {
		this.stat = stat;
		this.effort = effort;
		this.base_stat = base_stat;
	}

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

	@Override
	public String toString() {
		return "PokemonStat{" +
				"stat=" + stat +
				", effort=" + effort +
				", base_stat=" + base_stat +
				'}';
	}
}
