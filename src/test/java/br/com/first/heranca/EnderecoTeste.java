package br.com.first.heranca;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
@DisplayName("First: Ende�o")
class EnderecoTeste {
	
	private Endereco endereco;
	
	@BeforeEach
	void novo() {
		endereco = new Endereco();
	}
	
	@Test @DisplayName("Gets em nova inst�ncia.")
	void getsNovaInstancia() {
		assertNull(endereco.getCep());
		assertNull(endereco.getLogradouro());
	}
	
	@Test @DisplayName("Definir CEP.")
	void definirCEP() {
		endereco.setCep("CEP");
		assertEquals("CEP", endereco.getCep());
	}
	
	@Test @DisplayName("Definir Logradouro.")
	void definirLogradouro() {
		endereco.setLogradouro("Logradouro");
		assertEquals("Logradouro", endereco.getLogradouro());
	}
}