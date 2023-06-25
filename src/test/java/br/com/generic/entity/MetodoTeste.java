package br.com.generic.entity;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import br.com.generic.type.Object;

@TestInstance(Lifecycle.PER_CLASS)
@DisplayName("Método")
class MetodoTeste {
	
	private Metodo metodo;
	
	@BeforeEach
	void novo() {
		metodo = new Metodo();
	}
	
	@Test @DisplayName("isString para nulo.")
	void isStringNulo() {
		boolean isString = metodo.isString(null);
		assertFalse(isString);
	}
	
	@Test @DisplayName("isString para outra classe.")
	void isStringOutro() {
		List<Object> lista = new ArrayList<Object>();
		lista.add(new Object("Teste01"));
		
		boolean isString = metodo.isString(lista.get(0));
		assertFalse(isString);
	}
	
	@Test @DisplayName("isString para String.")
	void isString() {
		boolean isString = metodo.isString("Teste");
		assertTrue(isString);
	}
}