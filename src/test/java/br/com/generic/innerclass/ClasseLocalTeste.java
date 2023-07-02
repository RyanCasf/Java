package br.com.generic.innerclass;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
@DisplayName("Generic: Classe Local")
class ClasseLocalTeste {
	
	@Test @DisplayName("Executar classe local.")
	void retornarNomeComSucesso() {
		ClasseLocal classeLocal = new ClasseLocal();
		final String RETORNO = classeLocal.getNome();
		
		assertEquals("Nome", RETORNO);
	}
}