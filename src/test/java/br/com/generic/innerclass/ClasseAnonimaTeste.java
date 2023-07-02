package br.com.generic.innerclass;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
@DisplayName("Generic: Classe Anônima")
class ClasseAnonimaTeste {
	
	private ClasseAnonima classeAnonima;
	
	@BeforeEach
	void novo() {
		classeAnonima = new ClasseAnonima();
	}
	
	@Test @DisplayName("Executando com classe anônima.")
	void fazerComClasseAnonimaComSucesso() {
		classeAnonima.fazer();
	}
}