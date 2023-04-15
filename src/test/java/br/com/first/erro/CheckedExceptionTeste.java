package br.com.first.erro;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
@DisplayName("First: Checked Exception")
class CheckedExceptionTeste {
	
	@Test @DisplayName("Gerar Exception.")
	void gerarException() {
		assertThrows(CheckedException.class, () -> gerarComConstrutor());
		assertThrows(CheckedException.class, () -> gerar());
	}
	
	private void gerarComConstrutor() throws CheckedException {
		throw new CheckedException("exception test");
	}
	
	private void gerar() throws CheckedException {
		throw new CheckedException();
	}
}