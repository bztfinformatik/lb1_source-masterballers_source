package ch.pokeballers.pokedex;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PokemonMoveVersion {
	//Variablen erstellt
	private static final Logger logger = LoggerFactory.getLogger(Ability.class);
	private NamedAPIResource move_learn_method;
	private NamedAPIResource version_group;
	private int level_learned_at;

	/**
	 * Konstruktor
	 * @param move_learn_method
	 * @param version_group
	 * @param level_learned_at
	 */
	public PokemonMoveVersion(NamedAPIResource move_learn_method, NamedAPIResource version_group, int level_learned_at) {
		this.move_learn_method = move_learn_method;
		this.version_group = version_group;
		this.level_learned_at = level_learned_at;
	}

	public PokemonMoveVersion() {
	}

	// Setter und Getter Methoden für die Obrigen Parameter
	public NamedAPIResource getMove_learn_method() {
		return move_learn_method;
	}

	public void setMove_learn_method(NamedAPIResource move_learn_method) {
		this.move_learn_method = move_learn_method;
	}

	public NamedAPIResource getVersion_group() {
		return version_group;
	}

	public void setVersion_group(NamedAPIResource version_group) {
		this.version_group = version_group;
	}

	public int getLevel_learned_at() {
		return level_learned_at;
	}

	public void setLevel_learned_at(int level_learned_at) {
		this.level_learned_at = level_learned_at;
	}

	// Mit dieser Methode wird die toString Methode überschieben.
	@Override
	public String toString() {
		logger.info("weitere Pokemondaten (Moves) wurden gesetzt.");
		return "PokemonMoveVersion{" +
				"move_learn_method=" + move_learn_method +
				", version_group=" + version_group +
				", level_learned_at=" + level_learned_at +
				'}';
	}
}
