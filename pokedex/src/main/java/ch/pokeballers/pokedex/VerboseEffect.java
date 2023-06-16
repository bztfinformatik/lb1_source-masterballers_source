package ch.pokeballers.pokedex;

public class VerboseEffect {
	
	private String effect;

	private String short_effect;

	private NamedAPIResource language;

	public VerboseEffect(){

	}
	public VerboseEffect(String effect, String short_effect, NamedAPIResource language) {
		this.effect = effect;
		this.short_effect = short_effect;
		this.language = language;
	}

	public String getEffect() {
		return effect;
	}

	public void setEffect(String effect) {
		this.effect = effect;
	}

	public String getShort_effect() {
		return short_effect;
	}

	public void setShort_effect(String short_effect) {
		this.short_effect = short_effect;
	}

	public NamedAPIResource getLanguage() {
		return language;
	}

	public void setLanguage(NamedAPIResource language) {
		this.language = language;
	}

	@Override
	public String toString() {
		return "VerboseEffect{" +
				"effect='" + effect + '\'' +
				", short_effect='" + short_effect + '\'' +
				", language=" + language +
				'}';
	}
}
