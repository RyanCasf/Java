package br.com.generic.innerclass;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class ClasseLocalTeste {
	
	@Test
	void retornarNomeComSucesso() {
		ClasseLocal classeLocal = new ClasseLocal();
		final String RETORNO = classeLocal.getNome();
		
		assertEquals("Nome", RETORNO);
	}
}