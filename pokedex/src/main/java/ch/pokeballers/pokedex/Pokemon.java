package ch.pokeballers.pokedex;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Pokemon {
	//Variablen erstellt
	private static final Logger logger = LoggerFactory.getLogger(Ability.class);
	private int id;
	private String name;
	private int base_experience;
	private int height;
	private boolean is_default;
	private int order;
	private int weight;
    private String location_area_encounters;
    private PokemonSprites sprites;
	private NamedAPIResource species;
	private List<PokemonAbility> abilities;
	private List<NamedAPIResource> forms;
	private List<VersionGameIndex> game_indices;
	private List<PokemonStat> stats;
	private List<PokemonType> types;
    private List<PokemonMove> moves;


	/**
	 * Konstruktor
	 * @param id
	 * @param name
	 * @param base_experience
	 * @param height
	 * @param is_default
	 * @param order
	 * @param weight
	 * @param abilities
	 * @param forms
	 * @param game_indices
	 * @param location_area_encounters
	 * @param moves
	 * @param sprites
	 * @param species
	 * @param stats
	 * @param types
	 */
	public Pokemon(int id, String name, int base_experience, int height, boolean is_default, int order, int weight, List<PokemonAbility> abilities, List<NamedAPIResource> forms, List<VersionGameIndex> game_indices, String location_area_encounters, List<PokemonMove> moves, PokemonSprites sprites, NamedAPIResource species, List<PokemonStat> stats, List<PokemonType> types) {
		this.id = id;
		this.name = name;
		this.base_experience = base_experience;
		this.height = height;
		this.is_default = is_default;
		this.order = order;
		this.weight = weight;
		this.abilities = abilities;
		this.forms = forms;
		this.game_indices = game_indices;
		this.location_area_encounters = location_area_encounters;
		this.moves = moves;
		this.sprites = sprites;
		this.species = species;
		this.stats = stats;
		this.types = types;
	}

	public Pokemon() {

	}

	// Setter und Getter Methoden für die Obrigen Parameter
	public String getId() {
		return String.valueOf(id);
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

	public int getBase_experience() {
		return base_experience;
	}

	public void setBase_experience(int base_experience) {
		this.base_experience = base_experience;
	}

	public String getHeight() {
		return String.valueOf(height);
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public boolean isIs_default() {
		return is_default;
	}

	public void setIs_default(boolean is_default) {
		this.is_default = is_default;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public String getWeight() {
		return String.valueOf(weight);
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public List<PokemonAbility> getAbilities() {
		return abilities;
	}

	public void setAbilities(List<PokemonAbility> abilities) {
		this.abilities = abilities;
	}

	public List<NamedAPIResource> getForms() {
		return forms;
	}

	public void setForms(List<NamedAPIResource> forms) {
		this.forms = forms;
	}

    public List<VersionGameIndex> getGame_indices() {
		return game_indices;
	}

	public void setGame_indices(List<VersionGameIndex> game_indices) {
		this.game_indices = game_indices;
	}

	public String getLocation_area_encounters() {
		return location_area_encounters;
	}

	public void setLocation_area_encounters(String location_area_encounters) {
		this.location_area_encounters = location_area_encounters;
	}

	public List<PokemonMove> getMoves() {
		return moves;
	}

	public void setMoves(List<PokemonMove> moves) {
		this.moves = moves;
	}

	public NamedAPIResource getSpecies() {
		return species;
	}

	public void setSpecies(NamedAPIResource species) {
		this.species = species;
	}

	public List<PokemonStat> getStats() {
		return stats;
	}

	public void setStats(List<PokemonStat> stats) {
		this.stats = stats;
	}

    public PokemonSprites getSprites() {
		return sprites;
	}

	public void setSprites(PokemonSprites sprites) {
		this.sprites = sprites;
	}

	public List<PokemonType> getTypes() {
		return types;
	}

	public void setTypes(List<PokemonType> types) {
		this.types = types;
	}

	// Mit dieser Methode wird die toString Methode überschieben.
	@Override
	public String toString() {
		logger.info("Wichtige Informationen des Pokemons wurden vergeben.");
		return "Pokemon{" +
				", base_experience=" + base_experience +
				", is_default=" + is_default +
				", order=" + order +
				", abilities=" + abilities +
				", forms=" + forms +
				", game_indices=" + game_indices +
				", location_area_encounters='" + location_area_encounters + '\'' +
				", moves=" + moves +
				", sprites=" + sprites +
				", species=" + species +
				", stats=" + stats +
				", types=" + types +
				'}';
	}
}
