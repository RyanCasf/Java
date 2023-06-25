package br.com.generic.type;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
@DisplayName("Carro Rent�vel Service")
class CarroRentavelServiceTeste {
	
	private CarroRentavelService service;
	
	@BeforeEach
	void novo() {
		service = new CarroRentavelService();
	}
	
	@Test @DisplayName("Buscar primeiro carro dispon�vel.")
	void buscarUmCarroDisponivel() {
		Carro carro = service.buscarCarroDisponivel();
		assertEquals("BMW", carro.toString());
	}
	
	@Test @DisplayName("Buscar at� n�o restar carro dispon�vel.")
	void buscarCarroAteIndisponivel() {
		Carro carroBMW = service.buscarCarroDisponivel();
		assertEquals("BMW", carroBMW.toString());
		
		Carro carroFusca = service.buscarCarroDisponivel();
		assertEquals("Fusca", carroFusca.toString());
		
		Carro carroVazio = service.buscarCarroDisponivel();
		assertNull(carroVazio);
	}
	
	@Test @DisplayName("Retornar carro nulo.")
	void retornarCarroNulo() {
		boolean isRetornado = service.retornarCarro(null);
		assertFalse(isRetornado);
	}
	
	@Test @DisplayName("Retornar carro com sucesso.")
	void retornarCarroComSucesso() {
		Carro carro = new Carro("Teste");
		boolean isRetornado = service.retornarCarro(carro);
		
		assertTrue(isRetornado);
	}
}