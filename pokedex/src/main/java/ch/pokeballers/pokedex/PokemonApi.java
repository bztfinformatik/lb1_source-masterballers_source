package ch.pokeballers.pokedex;

import ch.pokeballers.pokedex.Ability;
import ch.pokeballers.pokedex.Pokemon;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

public class PokemonApi {

	public static Pokemon getPokemonDataById(int id) {
		String apiUrl = "https://pokeapi.co/api/v2/pokemon/{id}";
		String url = apiUrl.replace("{id}", Integer.toString(id));
		return getPokemonData(url);
	}

	public static Pokemon getPokemonDataByName(String name) {
		String apiUrl = "https://pokeapi.co/api/v2/pokemon/{name}";
		String url = apiUrl.replace("{name}", name);
		return getPokemonData(url);
	}

	private static Pokemon getPokemonData(String url) {

		RestTemplate restTemplate = new RestTemplate();

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<String> entity = new HttpEntity<>(headers);

		ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);

		Pokemon pokemon = null;
		if (response.getStatusCode().is2xxSuccessful()) {
			String json = response.getBody();

			try {
				ObjectMapper mapper = new ObjectMapper();
				pokemon = mapper.readValue(json, Pokemon.class);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return pokemon;
	}

}