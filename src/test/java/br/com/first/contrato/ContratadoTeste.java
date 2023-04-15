package br.com.first.contrato;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
@DisplayName("First: Contratado")
class ContratadoTeste {
	
	private Contratado contratado;
	
	@BeforeEach
	void novo() {
		contratado = new Contratado();
	}
	
	@Test @DisplayName("Constante por contrato.")
	void constanteDoContrato() {
		assertEquals("I/O Json", Contratado.SERVER_NAME);
	}
	
	@Test @DisplayName("Existe o método default.")
	void retornoDefaultFalso() {
		assertFalse(contratado.isReturn());
	}
	
	@Test @DisplayName("Executando salvar.")
	void salvar() {
		assertDoesNotThrow(() -> contratado.salvar(null));
	}
	
	@Test @DisplayName("Executando deletar.")
	void deletar() {
		assertDoesNotThrow(() -> contratado.deletar(0));
	}
}