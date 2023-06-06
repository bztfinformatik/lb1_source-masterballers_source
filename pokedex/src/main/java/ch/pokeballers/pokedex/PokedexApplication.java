package ch.pokeballers.pokedex;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.CacheControl;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.NavigationEvent;
import com.vaadin.flow.router.NavigationHandler;
import ch.pokeballers.pokedex.view.Mainview;

@SpringBootApplication
public class PokedexApplication {
	public static void main(String[] args) {
		SpringApplication.run(PokedexApplication.class, args);
	}
}
//plagiat: gibt ne 1!