package br.com.collection.igual;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
@DisplayName("Collection: Igual")
class IgualTeste {
	
	private Igual igual;
	
	@BeforeEach
	void novo() {
		igual = new Igual();
	}
	
	@Test @DisplayName("Para Equals com nulo.")
	void equalsNulo() {
		assertFalse(igual.equals(null));
	}
	
	@Test @DisplayName("Para Equals de objetos de mesma referência.")
	void equalsMesmaReferencia() {
		Igual igual2 = igual;
		assertTrue(igual.equals(igual2));
	}
	
	@Test @DisplayName("Para Equals de classes diferentes.")
	void equalsComClasseDiferentes() {
		Object object = new Object();
		assertFalse(igual.equals(object));
	}
	
	@Test @DisplayName("Para Equals com chave de origem nula.")
	void equalsComChaveOrigemNula() {
		Igual igualTemp = new Igual();
		assertFalse(igual.equals(igualTemp));
	}
	
	@Test @DisplayName("Para Equals com chave de parâmetro nula.")
	void equalsComChaveDeParametroNula() {
		Igual igualTemp = new Igual();
		igual.setChave(1l);
		
		assertFalse(igual.equals(igualTemp));
	}
	
	@Test @DisplayName("Para Equals.")
	void equals() {
		final long CHAVE = 1l;
		
		Igual igualTemp = new Igual();
		igualTemp.setChave(CHAVE);
		igual.setChave(CHAVE);
		
		assertTrue(igual.equals(igualTemp));
	}
}