package ch.pokeballers.pokedex;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PokemonApi {
	private static final Logger logger = LoggerFactory.getLogger(Ability.class);

	//Erstellt URL der API-Abfrage mithilfe der ID
	public static Pokemon getPokemonDataById(int id) {
		String apiUrl = "https://pokeapi.co/api/v2/pokemon/{id}";
		String url = apiUrl.replace("{id}", Integer.toString(id));
		logger.info("ID wurde in die URL gespeichert.");
		return getPokemonData(url);
	}
	//Erstellt URL der API-Abfrage mithilfe deS Namens
	public static Pokemon getPokemonDataByName(String name) {
		String apiUrl = "https://pokeapi.co/api/v2/pokemon/{name}";
		String url = apiUrl.replace("{name}", name);
		logger.info("Name wurde in die URL gespeichert.");
		return getPokemonData(url);
	}

	private static Pokemon getPokemonData(String url) { // mit der URL wird die API Abgefragt

		RestTemplate restTemplate = new RestTemplate();

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<String> entity = new HttpEntity<>(headers);

		ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);

		Pokemon pokemon = null; //Objekt, welches das gesuchte Pokemon wird, wird erstellt
		if (response.getStatusCode().is2xxSuccessful()) {
			String json = response.getBody(); // Der Body der Json Datei wird gespeichert

			try {
				ObjectMapper mapper = new ObjectMapper(); //Neuer Mapper wird erstellt
				pokemon = mapper.readValue(json, Pokemon.class); // Die gespeicherte Anfrage wird gemappt und auf das Objekt pokemon gespeichert
			} catch (Exception e) {
				e.printStackTrace();
				logger.error("Fehler beim Lesen der Fähigkeitsdaten: " + e.getMessage());
			}
		}
		else {
			logger.warn("Die API-Anfrage war nicht erfolgreich.");
		}
		logger.info("API wurde gegeben");
		return pokemon; //Objekt, welches das gesuchte Pokemon enthaellt, wird zurueckgegeben
	}

}