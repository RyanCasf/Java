package br.com.generic.innerclass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
@DisplayName("Classe Interna")
class ClasseInternaTeste {
	
	private ClasseInterna interna;
	
	@BeforeEach
	void novo() {
		interna = new ClasseInterna();
	}
	
	@Test @DisplayName("Verificar valor do atributo nome.")
	void atributoNome() {
		
	}
}