package br.com.stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
@DisplayName("Stream: Pessoa")
class PessoaTeste {
	
	private Pessoa pessoa;
	
	@BeforeEach
	void novo() {
		pessoa = new Pessoa(1l, null, null, false);
	}
	
	@Test @DisplayName("Definir construtor.")
	void definirConstrutor() {
		pessoa = new Pessoa(1l, "Nome", "fantasia", true);
		
		assertEquals(1l, pessoa.getId());
		assertEquals("Nome", pessoa.getNome());
		assertEquals("fantasia", pessoa.getNomeFantasia());
		assertTrue(pessoa.isCancelado());
	}
	
	@Test @DisplayName("Definir Id.")
	void definirId() {
		pessoa.setId(10l);
		assertEquals(10l, pessoa.getId());
	}
	
	@Test @DisplayName("Definir Nome.")
	void definirNome() {
		pessoa.setNome("nome");
		assertEquals("nome", pessoa.getNome());
	}
	
	@Test @DisplayName("Definir Nome Fantasia.")
	void definirNomeFantasia() {
		pessoa.setNomeFantasia("nome fantasia");
		assertEquals("nome fantasia", pessoa.getNomeFantasia());
	}
	
	@Test @DisplayName("Definir Cancelado.")
	void definirCancelado() {
		pessoa.setCancelado(true);
		assertTrue(pessoa.isCancelado());
	}
	
	@Test @DisplayName("toString.")
	void tToString() {
		assertEquals("1 | null - null", pessoa.toString());
	}
}