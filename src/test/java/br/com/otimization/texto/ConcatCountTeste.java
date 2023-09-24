package br.com.otimization.texto;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
@DisplayName("Otimização: Concat Count")
class ConcatCountTeste {
	
	private ConcatCount concat;

	@BeforeEach
	void init() {
		concat = new ConcatCount();
	}

	@Test @DisplayName("Percorrendo com String.")
	void percorrendoString() {
		assertDoesNotThrow(() -> concat.countString(100));
	}
	
	@Test @DisplayName("Percorrendo com Buffer.")
	void percorrendoBuffer() {
		assertDoesNotThrow(() -> concat.countBuffer(100));
	}
	
	@Test @DisplayName("Percorrendo com Builder.")
	void percorrendoBuilder() {
		assertDoesNotThrow(() -> concat.countBuilder(100));
	}
	
	@Test @DisplayName("Fazer count.")
	void make() {
		concat.make();
	}
}