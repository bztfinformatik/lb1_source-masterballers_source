package ch.pokeballers.pokedex;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AbilitiesPokemonApi {

	private static final Logger logger = LoggerFactory.getLogger(AbilitiesPokemonApi.class);

	// Hier wird die Ability des Pokemon anhand der ID geholt.
	public static Ability getPokemonAbilityDataById(int id) {
		String apiUrl = "https://pokeapi.co/api/v2/ability/{id}";
		String url = apiUrl.replace("{id}", Integer.toString(id));
		logger.info("ID wurde in die URL gespeichert.");
		return getAbilityData(url);
	}

	// Hier wird die Ability des Pokemon anhand des Namens geholt.
	public static Ability getPokemonAbilityDataByName(String name) {
		String apiUrl = "https://pokeapi.co/api/v2/ability/{name}";
		String url = apiUrl.replace("{name}", name);
		logger.info("Name wurde in die URL gespeichert.");
		return getAbilityData(url);
	}

	// Hiermit werden die Fähigkeiten des Pokemons abgefragt.
	private static Ability getAbilityData(String url) {

		RestTemplate restTemplate = new RestTemplate();

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		
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
				logger.error("Fehler beim Lesen der Fähigkeitsdaten: " + e.getMessage());
			}
		}

		else {
			logger.warn("Die API-Anfrage war nicht erfolgreich. Statuscode: " + response.getStatusCodeValue());  // Protokolliere eine Warnung mit dem Statuscode
		}

		logger.info("ability wurde gegeben");
		return ability;
	}

}
