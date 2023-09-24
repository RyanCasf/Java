package br.com.generic.type;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
@DisplayName("Generic: Rentável Service")
class RentavelServiceTeste {
	
	private RentavelService<Object> service;
	
	@BeforeEach
	void init() {
		List<Object> lista = new ArrayList<Object>();
		lista.add(new Object("Teste01"));
		lista.add(new Object("Teste02"));
		
		service = new RentavelService<Object>(lista);
	}
	
	@Test @DisplayName("Buscar primeiro disponível.")
	void buscarUmDisponivel() {
		Object object = service.buscarDisponivel();
		assertEquals("Teste01", object.toString());
	}
	
	@Test @DisplayName("Buscar até não restar disponível.")
	void buscarAteIndisponivel() {
		Object objTeste01 = service.buscarDisponivel();
		assertEquals("Teste01", objTeste01.toString());
		
		Object objTeste02 = service.buscarDisponivel();
		assertEquals("Teste02", objTeste02.toString());
		
		Object objTeste03 = service.buscarDisponivel();
		assertNull(objTeste03);
	}
	
	@Test @DisplayName("Retornar nulo.")
	void retornarNulo() {
		boolean isRetornado = service.retornar(null);
		assertFalse(isRetornado);
	}
	
	@Test @DisplayName("Retornar com sucesso.")
	void retornarComSucesso() {
		Object obj = new Object("Teste");
		boolean isRetornado = service.retornar(obj);
		
		assertTrue(isRetornado);
	}
}