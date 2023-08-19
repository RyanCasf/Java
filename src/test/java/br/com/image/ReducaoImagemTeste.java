package br.com.image;

import java.io.IOException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
@DisplayName("Redução de Imagem")
class ReducaoImagemTeste {
	
	@Test @DisplayName("Redimensionar imagem.")
	void redimensionarImagem() throws IOException {
		Assertions.assertThrows(NullPointerException.class, () -> ReducaoImagem.redimensionarImagem(null, null, 300, 240));
	}
}