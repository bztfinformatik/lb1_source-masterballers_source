package ch.pokeballers.pokedex;

import java.util.List;

public class Ability {

	private int id;
	private String name;
	private boolean is_main_series;
	private NamedAPIResource generation;
	private List<Name> names;
	private List<AbilityEffectChange> effect_changes;
	private List<AbilityFlavorText> flavor_text_entries;
	private List<AbilityPokemon> pokemon;

	public Ability() {

	}

	public Ability(int id, String name, boolean is_main_series, NamedAPIResource generation, List<Name> names, List<AbilityEffectChange> effect_changes, List<AbilityFlavorText> flavor_text_entries, List<AbilityPokemon> pokemon) {
		this.id = id;
		this.name = name;
		this.is_main_series = is_main_series;
		this.generation = generation;
		this.names = names;
		this.effect_changes = effect_changes;
		this.flavor_text_entries = flavor_text_entries;
		this.pokemon = pokemon;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isIs_main_series() {
		return is_main_series;
	}

	public void setIs_main_series(boolean is_main_series) {
		this.is_main_series = is_main_series;
	}

	public NamedAPIResource getGeneration() {
		return generation;
	}

	public void setGeneration(NamedAPIResource generation) {
		this.generation = generation;
	}

	public List<Name> getNames() {
		return names;
	}

	public void setNames(List<Name> names) {
		this.names = names;
	}

	public List<AbilityEffectChange> getEffect_changes() {
		return effect_changes;
	}

	public void setEffect_changes(List<AbilityEffectChange> effect_changes) {
		this.effect_changes = effect_changes;
	}

	public List<AbilityFlavorText> getFlavor_text_entries() {
		return flavor_text_entries;
	}

	public void setFlavor_text_entries(List<AbilityFlavorText> flavor_text_entries) {
		this.flavor_text_entries = flavor_text_entries;
	}

	public List<AbilityPokemon> getPokemon() {
		return pokemon;
	}

	public void setPokemon(List<AbilityPokemon> pokemon) {
		this.pokemon = pokemon;
	}

	@Override
	public String toString() {
		return "Ability{" +
				"id=" + id +
				", name='" + name + '\'' +
				", is_main_series=" + is_main_series +
				", generation=" + generation +
				", names=" + names +
				", effect_changes=" + effect_changes +
				", flavor_text_entries=" + flavor_text_entries +
				", pokemon=" + pokemon +
				'}';
	}
}
