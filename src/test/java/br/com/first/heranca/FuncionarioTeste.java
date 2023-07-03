package br.com.first.heranca;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.math.BigDecimal;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
@DisplayName("First: Funcionário")
class FuncionarioTeste {
	
	@Test @DisplayName("É some.")
	void isSome() {
		assertTrue(new Funcionario("Teste").isSome());
	}
	
	@Test @DisplayName("Funcionário é pessoa.")
	void funcionarioPessoa() {
		Endereco endereco1 = new Endereco();
		endereco1.setLogradouro("Lorem 1");
		endereco1.setCep("1");
		
		Endereco endereco2 = new Endereco();
		endereco2.setLogradouro("Lorem 2");
		endereco2.setCep("2");
		
		Endereco endereco3 = new Endereco();
		endereco3.setLogradouro("Lorem 3");
		endereco3.setCep("3");
		
		Funcionario funcionario = new Funcionario("funcionario");
		funcionario.setCpf("p1");
		funcionario.setEnderecos(List.of(endereco1, endereco2, endereco3));
		funcionario.setSalario(BigDecimal.TEN);
		
		assertEquals(3, funcionario.getEnderecos().size());
		assertEquals(BigDecimal.TEN, funcionario.getSalario());
		assertTrue(funcionario.isSome());
	}
	
	@Test @DisplayName("Retorno falso.")
	void retornoFalso() {
		assertTrue(new Funcionario("funcionario").isSome());
	}
	
	@Test @DisplayName("Imprimir em nova instância.")
	void imprimirNovaInstancia() {
		assertEquals("Nome = null, recebe = null", new Funcionario(null).imprimir());
	}
	
	@Test @DisplayName("Imprimir em nova instância com nome.")
	void imprimirNovaInstanciaComNome() {
		assertEquals("Nome = funcionario, recebe = null", new Funcionario("funcionario").imprimir());
	}
	
	@Test @DisplayName("Imprimir com nome.")
	void imprimirComNome() {
		Funcionario funcionario = new Funcionario("funcionario");
		funcionario.setNome("'nome'");
		
		assertEquals("Nome = 'nome', recebe = null", funcionario.imprimir());
	}
	
	@Test @DisplayName("Imprimir com valor.")
	void imprimirComValor() {
		Funcionario funcionario = new Funcionario(null);
		funcionario.setSalario(BigDecimal.TEN);
		
		assertEquals("Nome = null, recebe = 10,00", funcionario.imprimir());
	}
	
	@Test @DisplayName("Imprimir.")
	void imprimir() {
		Funcionario funcionario = new Funcionario("funcionario");
		funcionario.setNome("'nome'");
		funcionario.setSalario(BigDecimal.TEN);
		
		assertEquals("Nome = 'nome', recebe = 10,00", funcionario.imprimir());
	}
}