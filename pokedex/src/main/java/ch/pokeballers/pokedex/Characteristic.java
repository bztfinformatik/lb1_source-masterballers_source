package ch.pokeballers.pokedex;

import java.util.List;

public class Characteristic {

	private int id;
	private int gene_modulo;
	private List<Integer> possible_values;

	private List<Description> descriptions;

	private NamedAPIResource highest_stat;

	public Characteristic(int id, int gene_modulo, List<Integer> possible_values, List<Description> descriptions, NamedAPIResource highest_stat) {
		this.id = id;
		this.gene_modulo = gene_modulo;
		this.possible_values = possible_values;
		this.descriptions = descriptions;
		this.highest_stat = highest_stat;
	}

	public List<Description> getDescriptions() {
		return descriptions;
	}

	public void setDescriptions(List<Description> descriptions) {
		this.descriptions = descriptions;
	}

	public NamedAPIResource getHighest_stat() {
		return highest_stat;
	}

	public void setHighest_stat(NamedAPIResource highest_stat) {
		this.highest_stat = highest_stat;
	}

	public Characteristic() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGene_modulo() {
		return gene_modulo;
	}

	public void setGene_modulo(int gene_modulo) {
		this.gene_modulo = gene_modulo;
	}

	public List<Integer> getPossible_values() {
		return possible_values;
	}

	public void setPossible_values(List<Integer> possible_values) {
		this.possible_values = possible_values;
	}

	@Override
	public String toString() {
		return "Characteristic{" +
				"id=" + id +
				", gene_modulo=" + gene_modulo +
				", possible_values=" + possible_values +
				", descriptions=" + descriptions +
				", highest_stat=" + highest_stat +
				'}';
	}
}