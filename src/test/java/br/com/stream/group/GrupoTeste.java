package br.com.stream.group;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import br.com.stream.Pessoa;

@TestInstance(Lifecycle.PER_CLASS)
@DisplayName("Stream: Grupo")
class GrupoTeste {
	
	@Test @DisplayName("Separar em Grupo nulo.")
	void separarEmGrupoNulo() {
		assertThrows(NullPointerException.class, () -> Grupo.separarEmGrupo(null));
	}
	
	@Test @DisplayName("Separar em Grupo vazio.")
	void separarEmGrupoVazio() {
		assertDoesNotThrow(() -> Grupo.separarEmGrupo(new ArrayList<Pessoa>()));
	}
	
	@Test @DisplayName("Separar em Grupo único.")
	void separarEmGrupoUnico() {
		List<Pessoa> pessoas = List.of(
				new Pessoa(1, "A", "a", false),
				new Pessoa(2, "B", "b", false)
		);
		
		assertEquals(1, Grupo.separarEmGrupo(pessoas).size());
	}
	
	@Test @DisplayName("Separar em Grupo duplo.")
	void separarEmGrupoDuplo() {
		List<Pessoa> pessoas = List.of(
				new Pessoa(1, "A", "a", false),
				new Pessoa(2, "B", "b", true)
		);
		
		assertEquals(2, Grupo.separarEmGrupo(pessoas).size());
	}
}