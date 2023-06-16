package ch.pokeballers.pokedex;

public class App {
    public static void main(String[] args) {
        System.out.println(PokemonApi.getPokemonDataByName("pikachu").getName());
    }
}
