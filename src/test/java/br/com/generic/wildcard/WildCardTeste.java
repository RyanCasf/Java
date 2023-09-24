package br.com.generic.wildcard;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
@DisplayName("Generic: WildCard")
class WildCardTeste {
	
	private WildCard wildCard;
	
	@BeforeEach
	void init() {
		wildCard = new WildCard();
	}
	
	@Test @DisplayName("Printar consultar com animais nulo.")
	void printConsultarComAnimaisNulo() {
		Animal[] animais = null;
		assertDoesNotThrow(() -> wildCard.printConsultar(animais));
	}
	
	@Test @DisplayName("Printar consultar com animais vazio.")
	void printConsultarComAnimaisVazio() {
		Animal[] animais = new Animal[0];
		assertDoesNotThrow(() -> wildCard.printConsultar(animais));
	}
	
	@Test @DisplayName("Printar consultar animais com sucesso (cachorros).")
	void printConsultarComSucessoCachorros() {
		Cachorro[] cachorros = {new Cachorro(), new Cachorro()};
		wildCard.printConsultar(cachorros);
	}
	
	@Test @DisplayName("Printar consultar animais com sucesso (gatos).")
	void printConsultarComSucessoGatos() {
		Gato[] gatos = {new Gato(), new Gato()};
		wildCard.printConsultar(gatos);
	}
	
	@Test @DisplayName("Printar consultar animais com sucesso (animais).")
	void printConsultarComSucessoAnimais() {
		Animal[] animais = {new Cachorro(), new Gato()};
		wildCard.printConsultar(animais);
	}
	
	@Test @DisplayName("Printar consultar list com animais nula.")
	void printConsultarListComAnimaisNula() {
		List<Animal> animais = null;
		assertDoesNotThrow(() -> wildCard.printConsultar(animais));
	}
	
	@Test @DisplayName("Printar consultar list com animais vazio.")
	void printConsultarListComAnimaisVazio() {
		assertDoesNotThrow(() -> wildCard.printConsultar(new ArrayList<>()));
	}
	
	@Test @DisplayName("Printar consultar list animais com sucesso (cachorros).")
	void printConsultarListComSucessoCachorros() {
		List<Cachorro> cachorros = Arrays.asList(new Cachorro(), new Cachorro());
		wildCard.printConsultar(cachorros);
	}
	
	@Test @DisplayName("Printar consultar list animais com sucesso (gatos).")
	void printConsultarListComSucessoGatos() {
		List<Gato> gatos = Arrays.asList(new Gato(), new Gato());
		wildCard.printConsultar(gatos);
	}
	
	@Test @DisplayName("Printar consultar list animais com sucesso (animais).")
	void printConsultarListComSucessoAnimais() {
		List<Animal> animais = Arrays.asList(new Cachorro(), new Gato());
		wildCard.printConsultar(animais);
	}
}