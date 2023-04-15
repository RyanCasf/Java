package br.com.first.erro;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
@DisplayName("First: Unchecked Exception")
class UncheckedExceptionTeste {
	
	@Test @DisplayName("Gerar Exception.")
	void gerarException() {
		assertThrows(UncheckedException.class, () -> gerarComConstrutor());
		assertThrows(UncheckedException.class, () -> gerar());
	}
	
	private void gerarComConstrutor() {
		throw new UncheckedException("exception test");
	}
	
	private void gerar() {
		throw new UncheckedException();
	}
}