package br.com.collection.remover;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
@DisplayName("List Remove")
class ListRemoveTeste {
	
	private ListRemove listRemove;
	
	@BeforeEach
	void novo() {
		List<BigDecimal> lista = new ArrayList<BigDecimal>(Arrays.asList(
				BigDecimal.valueOf(1), BigDecimal.valueOf(5), BigDecimal.valueOf(0)
		));
		
		listRemove = new ListRemove(lista);
	}
	
	@Test @DisplayName("Construtor nulo.")
	void construtorNulo() {
		assertThrows(NullPointerException.class, () -> new ListRemove(null));
	}
	
	@Test @DisplayName("Remover Iterator.")
	void removerIterator() {
		final int QUANTIDADE_LISTA = listRemove.removerIterator();
		assertEquals(2, QUANTIDADE_LISTA);
	}
	
	@Test @DisplayName("Remover fun.")
	void removerFun() {
		final int QUANTIDADE_LISTA = listRemove.removerFunction();
		assertEquals(2, QUANTIDADE_LISTA);
	}
}