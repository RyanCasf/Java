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
	@DisplayName("Valor padr�o da String.")
	void padraoString() {
		assertNull(inicial.getString());
	}
	
	@Test
	@DisplayName("Valor padr�o do char.")
	void padraoChar() {
		assertEquals(0, inicial.getCaracter());
	}
	
	@Test
	@DisplayName("Valor padr�o do bit.")
	void padraoBits() {
		assertEquals(0, inicial.getBits());
	}
	
	@Test
	@DisplayName("Valor padr�o do short.")
	void padraoShort() {
		assertEquals(0, inicial.getShor());
	}
	
	@Test
	@DisplayName("Valor padr�o do int.")
	void padraoInt() {
		assertEquals(0, inicial.getInteiro());
	}
	
	@Test
	@DisplayName("Valor padr�o do long.")
	void padraoLong() {
		assertEquals(0, inicial.getLonguer());
	}
	
	@Test
	@DisplayName("Valor padr�o do booleano.")
	void padraoBoolean() {
		assertFalse(inicial.isBoleano());
	}
	
	@Test
	@DisplayName("Valor padr�o do float.")
	void padraoFloat() {
		assertEquals(0.0, inicial.getFlutuante());
	}
	
	@Test
	@DisplayName("Valor padr�o do double.")
	void padraoDouble() {
		assertEquals(0.0, inicial.getDoubler());
	}
}