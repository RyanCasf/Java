package br.com.first.heranca;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
@DisplayName("First: Pessoa")
class PessoaTeste {

	@Test @DisplayName("Endereços para pessoa.")
	void enderecoPessoa() {
		Endereco endereco1 = new Endereco();
		endereco1.setLogradouro("Lorem 1");
		endereco1.setCep("1");
		
		Endereco endereco2 = new Endereco();
		endereco2.setLogradouro("Lorem 2");
		endereco2.setCep("2");
		
		Endereco endereco3 = new Endereco();
		endereco3.setLogradouro("Lorem 3");
		endereco3.setCep("3");
		
		Pessoa pessoa = new Pessoa("pessoa");
		pessoa.setCpf("p1");
		pessoa.setEnderecos(List.of(endereco1, endereco2, endereco3));
		
		assertEquals(3, pessoa.getEnderecos().size());
	}
	
	@Test @DisplayName("Retorno falso.")
	void retornoFalso() {
		assertFalse(new Pessoa("pessoa").isSome());
	}
}