package br.com.stream.primitivos;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
@DisplayName("Stream: Inteiro")
class InteiroTeste {
	
	@Test @DisplayName("Range início e fim zerados.")
	void rangeTodosZerados() {
		assertTrue(Inteiro.range(0, 0).isEmpty());
	}
	
	@Test @DisplayName("Range com início maior que final.")
	void rangeInicioMaiorFinal() {
		assertTrue(Inteiro.range(1, 0).isEmpty());
	}
	
	@Test @DisplayName("Range.")
	void range() {
		List<Integer> range = Inteiro.range(0, 2);
		assertArrayEquals(Arrays.asList(0,1).toArray(), range.toArray());
	}
}