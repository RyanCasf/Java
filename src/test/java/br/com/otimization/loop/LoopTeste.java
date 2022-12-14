package br.com.otimization.loop;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
@DisplayName("Otimização: Loop")
class LoopTeste {
	
	private final String[] PALAVRAS = new String[3];
	private final Loop loop = new Loop();
	
	@Test
	@DisplayName("Percorrendo loop em for.")
	void percorrerLoopEmFor() {
		assertDoesNotThrow(() -> loop.loopFor(PALAVRAS));
	}
	
	@Test
	@DisplayName("Percorrendo loop em for com tamanho fixo.")
	void percorrerLoopEmForComTamanhoFixo() {
		assertDoesNotThrow(() -> loop.loopForSize(PALAVRAS));
	}
	
	@Test
	@DisplayName("Percorrendo loop em for each.")
	void percorrerLoopEmForEach() {
		assertDoesNotThrow(() -> loop.loopForEach(PALAVRAS));
	}
}