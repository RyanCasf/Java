package br.com.old.gotto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
@DisplayName("Old: Gotto")
class GottoTeste {
	
	private Gotto gotto;
	
	@BeforeEach
	void novo() {
		gotto = new Gotto();
	}
	
	@Test @DisplayName("GoTo old.")
	void main() {
		assertDoesNotThrow(() -> gotto.make());
	}
}