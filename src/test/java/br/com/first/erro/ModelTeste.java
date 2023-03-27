package br.com.first.erro;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
@DisplayName("First: Model exception")
class ModelTeste {
	
	@Test @DisplayName("Método com exception obrigatório.")
	void arquivoChecked() throws CheckedException {
		assertThrows(CheckedException.class, () -> Model.arquivoChecked());
	}
	
	@Test @DisplayName("Método com exception em runtime.")
	void arquivoUnchecked() {
		assertThrows(UncheckedException.class, () -> Model.arquivoUnchecked());
	}
	
	@Test @DisplayName("Método com exception obrigatório repassado no try catch.")
	void arquivoCheckedComTryCatch() throws Exception {
		assertThrows(Exception.class, () -> Model.arquivoCheckedComTryCatch());
	}
	
	@Test @DisplayName("Método com exception obrigatório repassado no try resource.")
	void lerArquivoTryResource() throws Exception {
		assertThrows(Exception.class, () -> Model.lerArquivo());
	}
}