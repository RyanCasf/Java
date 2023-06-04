package br.com.collection.pesquisa;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
@DisplayName("Binary Search")
class BinarySearchTeste {
	
	private BinarySearch search;
	
	@BeforeEach
	void novo() {
		search = new BinarySearch(Arrays.asList(0,1,2,3,4,5));
	}
	
	@Test @DisplayName("Construtor list null.")
	void construtorNullPointer() {
		assertThrows(NullPointerException.class, () -> new BinarySearch(null));
	}
	
	@Test @DisplayName("Buscar inexistente.")
	void buscarElementoInexistente() {
		final String RETORNO = search.buscar(-1);
		assertEquals("O número -1 foi encontrado na posição: -1", RETORNO);
	}
	
	@Test @DisplayName("Buscar.")
	void buscar() {
		final String RETORNO = search.buscar(2);
		assertEquals("O número 2 foi encontrado na posição: 2", RETORNO);
	}
}