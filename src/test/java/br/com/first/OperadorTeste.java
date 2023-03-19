package br.com.first;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("First: Operadores")
class OperadorTeste {

    private Operador operador = new Operador();

    @Test @DisplayName("Somar passando 0.")
    void somarUmZero() {
        assertEquals(0.0d, operador.somar(0));
    }

    @Test @DisplayName("Somar vazio.")
    void somarVazio() {
        assertEquals(0.0d, operador.somar());
    }

    @Test @DisplayName("Somar sequência.")
    void somarSequencia() {
        assertEquals(10, operador.somar(1,2,3,4,0,0,1,-1));
    }
    
    @Test @DisplayName("Subtrair zeros.")
    void subtrairZerado() {
    	assertEquals(0, operador.subtrair(0, 0));
    }
    
    @Test @DisplayName("Subtrair positivo maior.")
    void subtrairResultadoPositivo() {
    	assertEquals(5.0d, operador.subtrair(10.0d, 5));
    }
    
    @Test @DisplayName("Subtrair negativo maior.")
    void subtrairResultadoNegativo() {
    	assertEquals(-5.0d, operador.subtrair(5, 10.0d));
    }
    
    @Test @DisplayName("Subtrair entre negativos.")
    void subtrairNegativoAmbos() {
    	assertEquals(-5.0d, operador.subtrair(-10.0d, -5));
    }
    
    @Test @DisplayName("Subtrair negativo.")
    void subtrairNegativo() {
    	assertEquals(5.0d, operador.subtrair(-5, -10));
    }
}