package br.com.stream.filter;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import br.com.stream.Pessoa;

@TestInstance(Lifecycle.PER_CLASS)
@DisplayName("Stream: Filtro")
class FiltroTeste {
	
	@Test @DisplayName("Pesquisar lista nula.")
	void pesquisarIdNulo() {
		assertThrows(NullPointerException.class, () -> Filtro.pesquisar(null, 0));
	}
	
	@Test @DisplayName("Pesquisar lista vazia.")
	void pesquisarIdVazia() {
		assertDoesNotThrow(() -> Filtro.pesquisar(new ArrayList<Pessoa>(), 0));
	}
	
	@Test @DisplayName("Pesquisar pessoa com id zerado.")
	void pesquisarIdZerado() {
		List<Pessoa> pessoas = List.of(
				new Pessoa(1, "A", "a", false),
				new Pessoa(2, "B", "b", false)
		);
		
		assertTrue(Filtro.pesquisar(pessoas, 0).isEmpty());
	}
	
	@Test @DisplayName("Pesquisar pessoa com id negativo.")
	void pesquisarIdNegativo() {
		List<Pessoa> pessoas = List.of(
				new Pessoa(1, "A", "a", false),
				new Pessoa(2, "B", "b", false)
		);
		
		assertTrue(Filtro.pesquisar(pessoas, -1).isEmpty());
	}
	
	@Test @DisplayName("Pesquisar pessoa com id inexistente.")
	void pesquisarIdInexistente() {
		List<Pessoa> pessoas = List.of(
				new Pessoa(1, "A", "a", false),
				new Pessoa(2, "B", "b", false)
		);
		
		assertTrue(Filtro.pesquisar(pessoas, 10).isEmpty());
	}
	
	@Test @DisplayName("Pesquisar pessoa com id com redundância.")
	void pesquisarIdComRedundancia() {
		List<Pessoa> pessoas = List.of(
				new Pessoa(1, "A", "a", false),
				new Pessoa(1, "B", "b", false)
		);
		
		assertFalse(Filtro.pesquisar(pessoas, 1).isEmpty());
		assertEquals(2, Filtro.pesquisar(pessoas, 1).size());
	}
	
	@Test @DisplayName("Pesquisar pessoa com id.")
	void pesquisarId() {
		List<Pessoa> pessoas = List.of(
				new Pessoa(1, "A", "a", false),
				new Pessoa(2, "B", "b", false)
		);
		
		assertFalse(Filtro.pesquisar(pessoas, 1).isEmpty());
		assertEquals(1, Filtro.pesquisar(pessoas, 1).size());
	}
}