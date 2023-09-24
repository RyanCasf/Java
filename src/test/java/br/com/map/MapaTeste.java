package br.com.map;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
@DisplayName("Map: Mapa")
class MapaTeste {
	
	private Mapa mapa;
	
	@BeforeEach
	void init() {
		mapa = new Mapa();
	}
	
	@Test @DisplayName("Listar.")
	void percorrerListar() {
		mapa.listar();
	}
}