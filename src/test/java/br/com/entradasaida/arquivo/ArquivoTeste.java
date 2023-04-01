package br.com.entradasaida.arquivo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
@DisplayName("Entrada e Saída: Arquivo")
class ArquivoTeste {
	
	@Test @DisplayName("Criar passando caminho nulo.")
	void criarPassandoNulo() {
		assertThrows(IllegalArgumentException.class, () -> Arquivo.criar(null));
	}
	
	@Test @DisplayName("Criar passando caminho em branco.")
	void criarPassandoBranco() {
		assertThrows(IllegalArgumentException.class, () -> Arquivo.criar("    "));
	}
	
	@Test @DisplayName("Criar arquivo.")
	void criarArquivo() {
		assertDoesNotThrow(() -> Arquivo.criar("teste2.txt")	);
	}
}