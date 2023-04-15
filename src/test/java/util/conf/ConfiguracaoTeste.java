package util.conf;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
@DisplayName("Config: Configuração")
class ConfiguracaoTeste {
	
	@Test @DisplayName("Imprimir nulo.")
	void imprimirNulo() {
		assertDoesNotThrow(() -> Configuracao.imprimir(null));
	}
	
	@Test @DisplayName("Imprimir.")
	void imprimir() {
		assertDoesNotThrow(() -> Configuracao.imprimir("Imprimir"));
	}
}