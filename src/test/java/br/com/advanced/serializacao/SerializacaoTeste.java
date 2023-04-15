package br.com.advanced.serializacao;

import java.io.IOException;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("Advanced: Serializable")
class SerializacaoTeste {

    private Aluno aluno;
    
    @BeforeAll
    void novo() {
    	aluno  = new Aluno(1l, "teste", "12345");
    	
    	Turma turma = new Turma();
    	turma.setNome("Turma");
    	aluno.setTurma(turma);
    }
    
    @Test @DisplayName("Serializar nula.")
    void serializarNula() throws IOException {
        Serializacao.serializar(null);
    }
    
    @Test @DisplayName("Serializar.")
    void serializar() throws IOException {
        Serializacao.serializar(aluno);
    }

    @Test @DisplayName("Deserializar.")
    void deserializar() {
        Serializacao.deserializar();
    }
}