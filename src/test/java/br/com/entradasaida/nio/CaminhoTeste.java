package br.com.entradasaida.nio;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("CaminhoTeste")
class CaminhoTeste {

    @Test @DisplayName("Criar passando caminho nulo.")
    void criarPassandoNulo() {
        assertThrows(IllegalArgumentException.class, () -> Caminho.criar(null));
    }

    @Test @DisplayName("Criar passando caminho em branco.")
    void criarPassandoBranco() {
        assertThrows(IllegalArgumentException.class, () -> Caminho.criar("    "));
    }

    @Test @DisplayName("Criar arquivo.")
    void criarArquivo() {
        assertDoesNotThrow(() -> Caminho.criar("teste2.txt")	);
    }

    @Test @DisplayName("Resolvendo normalização de caminhos com resolve.")
    void resolve() {
        assertDoesNotThrow(Caminho::resolve);
    }

    @Test @DisplayName("Problema de normalização de caminhos com relatize de absoluto x relativo.")
    void relatizeCasoProble() {
        assertThrows(IllegalArgumentException.class, Caminho::relatizeCasoProble);
    }
}