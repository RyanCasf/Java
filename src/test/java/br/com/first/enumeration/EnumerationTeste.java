package br.com.first.enumeration;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
@DisplayName("First: Enumeration")
class EnumerationTeste {
	
	@Test @DisplayName("Retonando valores.")
	void retorno() {
		assertTrue(Enumeration.values().length > 0);
	}
	
	@Test @DisplayName("Comparação de igualdade de escrita para toString.")
	void enumParaToStringValida() {
		for (Enumeration e : Enumeration.values()) {
			assertTrue(e.name().equalsIgnoreCase(e.toString()));
		}
	}
	
	@Test @DisplayName("	Imprimir com contains da enum.")
	void imprimirContains() {
		for (Enumeration e : Enumeration.values()) {
			assertTrue(e.imprimir().contains(e.toString().toLowerCase()));
		}
	}
}