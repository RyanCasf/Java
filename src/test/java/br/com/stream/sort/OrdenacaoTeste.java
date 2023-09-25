package br.com.stream.sort;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import br.com.util.model.Usuario;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
@DisplayName("Stream: Ordenação")
class OrdenacaoTeste {

	private List<Usuario> pessoasOrdenacao;

	@BeforeAll
	void initAll() {
		pessoasOrdenacao = List.of(
				new Usuario("3", "C", "c"),
				new Usuario("0", "A", "a"),
				new Usuario("2", "Zz", "z"),
				new Usuario("1", "B", "b")
		);
	}

	@Test @DisplayName("Ordenar com lista vazia.")
	void ordenarVazia() {
		assertDoesNotThrow(() -> Ordenacao.ordenarPorId(new ArrayList<Usuario>()));
	}
	
	@Test @DisplayName("Ordenar por CPF.")
	void ordenarCpf() {
		pessoasOrdenacao = Ordenacao.ordenarPorId(pessoasOrdenacao);
		
		assertEquals("a", pessoasOrdenacao.get(0).getCpf());
		assertEquals("b", pessoasOrdenacao.get(1).getCpf());
		assertEquals("c", pessoasOrdenacao.get(2).getCpf());
		assertEquals("z", pessoasOrdenacao.get(3).getCpf());
	}
}