package br.com.enumeradores;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import br.com.pattern.enumeradores.Enumerador;

@TestInstance(Lifecycle.PER_CLASS)
@DisplayName("Enumerador")
class EnumeradorTeste {
	
	@Test
	@DisplayName("Existem enumeradores.")
	void existeEnumeradores() {
		assertTrue(Enumerador.values().length > 0);
	}
	
	@Test
	@DisplayName("Enumeradores contém saída.")
	void enumeradoresConterSaida() {
		final Enumerador[] ENUMERADORES = Enumerador.values();
		for (Enumerador e : ENUMERADORES) {
			assertNotEquals("", Character.valueOf(e.getSexo()));
		}
	}
}