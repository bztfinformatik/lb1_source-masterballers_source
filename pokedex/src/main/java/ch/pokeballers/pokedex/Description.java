package ch.pokeballers.pokedex;

public class Description {

	private String description;
	private NamedAPIResource language;

	public Description(String description, NamedAPIResource language) {
		this.description = description;
		this.language = language;
	}

	public Description(){

	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public NamedAPIResource getLanguage() {
		return language;
	}

	public void setLanguage(NamedAPIResource language) {
		this.language = language;
	}

	@Override
	public String toString() {
		return "Description{" +
				"description='" + description + '\'' +
				", language=" + language +
				'}';
	}
}
