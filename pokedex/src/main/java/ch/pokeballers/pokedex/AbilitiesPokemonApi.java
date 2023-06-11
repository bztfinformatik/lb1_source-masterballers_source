package ch.pokeballers.pokedex;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

public class AbilitiesPokemonApi {

	public static Ability getPokemonAbilityDataById(int id) {
		String apiUrl = "https://pokeapi.co/api/v2/ability/{id}";
		String url = apiUrl.replace("{id}", Integer.toString(id));
		return getAbilityData(url);
	}

	public static Ability getPokemonAbilityDataByName(String name) {
		String apiUrl = "https://pokeapi.co/api/v2/ability/{name}";
		String url = apiUrl.replace("{name}", name);
		return getAbilityData(url);
	}

	private static Ability getAbilityData(String url) {

		RestTemplate restTemplate = new RestTemplate();

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		// Set the headers for the request
		HttpEntity<String> entity = new HttpEntity<>(headers);

		ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);

		Ability ability = null;
		if (response.getStatusCode().is2xxSuccessful()) {
			String json = response.getBody();

			try {
				ObjectMapper mapper = new ObjectMapper();
				ability = mapper.readValue(json, Ability.class);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return ability;
	}

}
