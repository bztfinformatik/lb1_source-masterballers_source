package ch.pokeballers.pokedex;

public class VersionGameIndex {

	private int game_index;
	private NamedAPIResource version;

	public VersionGameIndex(){

	}

	public VersionGameIndex(int game_index, NamedAPIResource version) {
		this.game_index = game_index;
		this.version = version;
	}

	public int getGame_index() {
		return game_index;
	}

	public void setGame_index(int game_index) {
		this.game_index = game_index;
	}

	public NamedAPIResource getVersion() {
		return version;
	}

	public void setVersion(NamedAPIResource version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "VersionGameIndex{" +
				"game_index=" + game_index +
				", version=" + version +
				'}';
	}
}
