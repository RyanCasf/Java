package br.com.stream.group;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import br.com.util.model.Usuario;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
@DisplayName("Stream: Grupo")
class GrupoTeste {
	
	@Test @DisplayName("Separar em Grupo nulo.")
	void separarEmGrupoNulo() {
		assertThrows(NullPointerException.class, () -> Grupo.separarEmGrupo(null));
	}
	
	@Test @DisplayName("Separar em Grupo vazio.")
	void separarEmGrupoVazio() {
		assertDoesNotThrow(() -> Grupo.separarEmGrupo(new ArrayList<>()));
	}
	
	@Test @DisplayName("Separar em Grupo único.")
	void separarEmGrupoUnico() {
		List<Usuario> usuarios = List.of(
				new Usuario("1", "A", "a"),
				new Usuario("2", "B", "b")
		);
		
		assertEquals(1, Grupo.separarEmGrupo(usuarios).size());
	}
	
	@Test @DisplayName("Separar em Grupo duplo.")
	void separarEmGrupoDuplo() {
		List<Usuario> usuarios = List.of(
				new Usuario(1, "A", "a", false),
				new Usuario(2, "B", "b", true)
		);
		
		assertEquals(2, Grupo.separarEmGrupo(usuarios).size());
	}
}