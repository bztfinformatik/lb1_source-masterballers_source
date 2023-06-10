package ch.pokeballers.pokedex;

public class Name {

	private String name;
	private NamedAPIResource language;

	public Name(String name, NamedAPIResource language) {
		this.name = name;
		this.language = language;
	}
	public Name(){

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public NamedAPIResource getLanguage() {
		return language;
	}

	public void setLanguage(NamedAPIResource language) {
		this.language = language;
	}

	@Override
	public String toString() {
		return "Name{" +
				"name='" + name + '\'' +
				", language=" + language +
				'}';
	}
}