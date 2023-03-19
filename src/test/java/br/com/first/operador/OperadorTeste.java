package br.com.first.operador;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("First: Operadores")
class OperadorTeste {

    private Operador operador;
    
    @BeforeEach
    void novo() {
    	operador = new Operador();
    }

    @Test @DisplayName("Somar passando 0.")
    void somarUmZero() {
        assertEquals(0.0d, operador.somar(0));
    }
    
    @Test @DisplayName("Somar nulo.")
    void somarNulo() {
    	assertThrows(NullPointerException.class, () -> operador.somar(null));
    }
    
    @Test @DisplayName("Somar vazio.")
    void somarVazio() {
    	assertThrows(NullPointerException.class, () -> operador.somar());
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
    
    @Test @DisplayName("Multiplicar nulo.")
    void multiplicarNulo() {
    	assertThrows(NullPointerException.class, () -> operador.multiplicar(null));
    }
    
    @Test @DisplayName("Multiplicar vazio.")
    void multiplicarVazio() {
    	assertThrows(NullPointerException.class, () -> operador.multiplicar());
    }
    
    @Test @DisplayName("Multiplicar zero.")
    void multiplicarZero() {
    	assertEquals(0, operador.multiplicar(0));
    }
    
    @Test @DisplayName("Multiplicar 'n' zeros.")
    void multiplicarNZeros() {
    	assertEquals(0, operador.multiplicar(0,0,0,0,0,0,0,0,0,0,0,0));
    }
    
    @Test @DisplayName("Multiplicar 'n' positivos.")
    void multiplicarNPositivos() {
    	assertEquals(1320, operador.multiplicar(1,2,2,5,6,11));
    }
    
    @Test @DisplayName("Multiplicar com -1.")
    void multiplicarUmNegativo() {
    	assertEquals(-1320, operador.multiplicar(-1,2,2,5,6,11));
    }
}