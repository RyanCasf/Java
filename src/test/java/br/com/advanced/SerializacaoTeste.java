package br.com.advanced;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.io.IOException;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("Advanced: Serializable")
class SerializacaoTeste {

    private final Aluno ALUNO = new Aluno(1l, "teste", "12345");

    @Test @DisplayName("Serializar.")
    void serializar() throws IOException {
        Serializacao.serializar(ALUNO);
    }

    @Test @DisplayName("Deserializar.")
    void deserializar() {
        Serializacao.deserializar();
    }
}