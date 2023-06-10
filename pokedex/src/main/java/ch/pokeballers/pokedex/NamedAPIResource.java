package ch.pokeballers.pokedex;

public class NamedAPIResource {

	private String name;
	private String url;

	public NamedAPIResource(String name, String url) {
		this.name = name;
		this.url = url;
	}
	public NamedAPIResource(){

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "NamedAPIResource{" +
				"name='" + name + '\'' +
				", url='" + url + '\'' +
				'}';
	}
}
