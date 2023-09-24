package br.com.generic.type;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
@DisplayName("Generic: Barco Rentável Service")
class BarcoRentavelServiceTeste {
	
	private BarcoRentavelService service;
	
	@BeforeEach
	void init() {
		service = new BarcoRentavelService();
	}
	
	@Test @DisplayName("Buscar primeiro barco disponível.")
	void buscarUmBarcoDisponivel() {
		Object barco = service.buscarBarcoDisponivel();
		assertEquals("Lancha", barco.toString());
	}
	
	@Test @DisplayName("Buscar até não restar barco disponível.")
	void buscarBarcoAteIndisponivel() {
		Object barcoLancha = service.buscarBarcoDisponivel();
		assertEquals("Lancha", barcoLancha.toString());
		
		Object barcoCanoa = service.buscarBarcoDisponivel();
		assertEquals("Canoa", barcoCanoa.toString());
		
		Object barcoVazio = service.buscarBarcoDisponivel();
		assertNull(barcoVazio);
	}
	
	@Test @DisplayName("Retornar barco nulo.")
	void retornarBarcoNulo() {
		boolean isRetornado = service.retornarBarco(null);
		assertFalse(isRetornado);
	}
	
	@Test @DisplayName("Retornar barco com sucesso.")
	void retornarBarcoComSucesso() {
		Object barco = new Object("Teste");
		boolean isRetornado = service.retornarBarco(barco);
		
		assertTrue(isRetornado);
	}
}