package ch.pokeballers.pokedex;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AbilityEffectChange {
	//Variablen erstellt
	private static final Logger logger = LoggerFactory.getLogger(Ability.class);

	private List<Effect> effect_entries;
	private NamedAPIResource version_group;

	/**
	 * Konstruktor
	 * @param effect_entries
	 * @param version_group
	 */
	public AbilityEffectChange(List<Effect> effect_entries, NamedAPIResource version_group) {
		this.effect_entries = effect_entries;
		this.version_group = version_group;
	}

	public AbilityEffectChange(){

	}


	// Setter und Getter Methoden für die Obrigen Parameter
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

	// Mit dieser Methode wird die toString Methode überschieben.
	@Override
	public String toString() {
		logger.info("weitere Fähigkeitsdaten wurden gesetzt. ");
		return "AbilityEffectChange{" +
				"effect_entries=" + effect_entries +
				", version_group=" + version_group +
				'}';
	}
}
