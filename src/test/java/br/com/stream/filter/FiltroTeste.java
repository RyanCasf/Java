package br.com.stream.filter;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import br.com.util.model.Usuario;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
@DisplayName("Stream: Filtro")
class FiltroTeste {
	
	@Test @DisplayName("Pesquisar lista nula.")
	void pesquisarIdNulo() {
		assertThrows(NullPointerException.class, () -> Filtro.pesquisar(null, 0));
	}
	
	@Test @DisplayName("Pesquisar lista vazia.")
	void pesquisarIdVazia() {
		assertDoesNotThrow(() -> Filtro.pesquisar(new ArrayList<>(), 0));
	}
	
	@Test @DisplayName("Pesquisar pessoa com id zerado.")
	void pesquisarIdZerado() {
		List<Usuario> usuarios = List.of(
				new Usuario(1, "A", "a", false),
				new Usuario(2, "B", "b", false)
		);
		
		assertTrue(Filtro.pesquisar(usuarios, 0).isEmpty());
	}
	
	@Test @DisplayName("Pesquisar pessoa com id negativo.")
	void pesquisarIdNegativo() {
		List<Usuario> usuarios = List.of(
				new Usuario(1, "A", "a", false),
				new Usuario(2, "B", "b", false)
		);
		
		assertTrue(Filtro.pesquisar(usuarios, -1).isEmpty());
	}
	
	@Test @DisplayName("Pesquisar pessoa com id inexistente.")
	void pesquisarIdInexistente() {
		List<Usuario> usuarios = List.of(
				new Usuario(1, "A", "a", false),
				new Usuario(2, "B", "b", false)
		);
		
		assertTrue(Filtro.pesquisar(usuarios, 10).isEmpty());
	}
	
	@Test @DisplayName("Pesquisar pessoa com id com redundância.")
	void pesquisarIdComRedundancia() {
		List<Usuario> usuarios = List.of(
				new Usuario(1, "A", "a", false),
				new Usuario(1, "B", "b", false)
		);
		
		assertFalse(Filtro.pesquisar(usuarios, 1).isEmpty());
		assertEquals(2, Filtro.pesquisar(usuarios, 1).size());
	}
	
	@Test @DisplayName("Pesquisar pessoa com id.")
	void pesquisarId() {
		List<Usuario> usuarios = List.of(
				new Usuario(1, "A", "a", false),
				new Usuario(2, "B", "b", false)
		);
		
		assertFalse(Filtro.pesquisar(usuarios, 1).isEmpty());
		assertEquals(1, Filtro.pesquisar(usuarios, 1).size());
	}
}