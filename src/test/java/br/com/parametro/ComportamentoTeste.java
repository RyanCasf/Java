package br.com.parametro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
@DisplayName("Param: Comportamento")
class ComportamentoTeste {
	
	private Comportamento comportamento;
	
	@BeforeEach
	void novo() {
		comportamento = new Comportamento();
	}
	
	@Test @DisplayName("Filtrar.")
	void filtrar() {
		comportamento.filtrar();
		
		assertEquals(1, comportamento.getCarros().size());
		assertEquals("green", comportamento.getCarros().get(0).getCor());
		assertEquals(2015, comportamento.getCarros().get(0).getAno());
	}
}