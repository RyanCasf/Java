package br.com.entradasaida.propriedade;

import br.com.entradasaida.propriedades.PropriedadeArquivo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.io.IOException;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("Entrada e Saída: Propriedades do Arquivo")
class PropriedadeArquivoTeste {

    @Test @DisplayName("Alterar propriedade do arquivo de última modificação sem caminho.")
    void alterUltimaModificacaoSemCaminho() {
        assertThrows(IllegalArgumentException.class, () -> PropriedadeArquivo.alterUltimaModificacao(null, null));
    }

    @Test @DisplayName("Alterar propriedade do arquivo de última modificação sem data.")
    void alterUltimaModificacaoSemData() {
        assertThrows(IllegalArgumentException.class, () -> PropriedadeArquivo.alterUltimaModificacao("teste.txt", null));
    }
}