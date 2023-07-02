package br.com.generic.innerclass;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
@DisplayName("Generic: Classe Interna Estática")
class ClasseInternaEstaticaTeste {
	
	private ClasseInternaEstatica classeInternaEstatica;
	
	@BeforeEach
	void novo() {
		classeInternaEstatica = new ClasseInternaEstatica();
	}
	
	@Test @DisplayName("Ligado com inicialização com sucesso.")
	void isLigadoComSucesso() {
		classeInternaEstatica.iniciar();
		assertTrue(ClasseInternaEstatica.ligado);
	}
}