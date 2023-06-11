package ch.pokeballers.pokedex;

import java.util.List;

public class AbilityEffectChange {

		private List<Effect> effect_entries;
		private NamedAPIResource version_group;

	public AbilityEffectChange(List<Effect> effect_entries, NamedAPIResource version_group) {
		this.effect_entries = effect_entries;
		this.version_group = version_group;
	}
	public AbilityEffectChange(){

	}

	public List<Effect> getEffect_entries() {
		return effect_entries;
	}

	public void setEffect_entries(List<Effect> effect_entries) {
		this.effect_entries = effect_entries;
	}

	public NamedAPIResource getVersion_group() {
		return version_group;
	}

	public void setVersion_group(NamedAPIResource version_group) {
		this.version_group = version_group;
	}

	@Override
	public String toString() {
		return "AbilityEffectChange{" +
				"effect_entries=" + effect_entries +
				", version_group=" + version_group +
				'}';
	}
}
