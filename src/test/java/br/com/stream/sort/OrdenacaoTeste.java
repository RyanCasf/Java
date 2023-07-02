package br.com.stream.sort;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import br.com.stream.Pessoa;

@TestInstance(Lifecycle.PER_CLASS)
@DisplayName("Stream: Ordenação")
class OrdenacaoTeste {
	
	@Test @DisplayName("Ordenar com lista vazia.")
	void ordenarVazia() {
		assertDoesNotThrow(() -> Ordenacao.ordenarPorId(new ArrayList<Pessoa>()));
	}
	
	@Test @DisplayName("Ordenar por ID.")
	void ordenarId() {
		List<Pessoa> pessoas = List.of(
				new Pessoa(3, "C", "c", false),
				new Pessoa(0, "A", "a", false),
				new Pessoa(2, "Zz", "zz", false),
				new Pessoa(1, "B", "b", false)
		);
		
		pessoas = Ordenacao.ordenarPorId(pessoas);
		
		final int QUANTIDADE_ORDENACAO = pessoas.size();
		for (int i=0; i<QUANTIDADE_ORDENACAO; i++) {
			assertEquals(i, pessoas.get(i).getId());
		}
	}
}