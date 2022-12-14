package br.com.inicial;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import br.com.first.inicial.Inicial;

@TestInstance(Lifecycle.PER_CLASS)
@DisplayName("Inicial")
class InicialTeste {
	
	private Inicial inicial = new Inicial();
	
	@Test
	@DisplayName("Valor padrão da String.")
	void padraoString() {
		assertNull(inicial.getString());
	}
	
	@Test
	@DisplayName("Valor padrão do char.")
	void padraoChar() {
		assertEquals(0, inicial.getCaracter());
	}
	
	@Test
	@DisplayName("Valor padrão do bit.")
	void padraoBits() {
		assertEquals(0, inicial.getBits());
	}
	
	@Test
	@DisplayName("Valor padrão do short.")
	void padraoShort() {
		assertEquals(0, inicial.getShor());
	}
	
	@Test
	@DisplayName("Valor padrão do int.")
	void padraoInt() {
		assertEquals(0, inicial.getInteiro());
	}
	
	@Test
	@DisplayName("Valor padrão do long.")
	void padraoLong() {
		assertEquals(0, inicial.getLonguer());
	}
	
	@Test
	@DisplayName("Valor padrão do booleano.")
	void padraoBoolean() {
		assertFalse(inicial.isBoleano());
	}
	
	@Test
	@DisplayName("Valor padrão do float.")
	void padraoFloat() {
		assertEquals(0.0, inicial.getFlutuante());
	}
	
	@Test
	@DisplayName("Valor padrão do double.")
	void padraoDouble() {
		assertEquals(0.0, inicial.getDoubler());
	}
}