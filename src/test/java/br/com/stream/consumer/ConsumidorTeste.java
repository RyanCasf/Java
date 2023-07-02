package br.com.stream.consumer;

import java.util.Arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
@DisplayName("Stream: Consumidor")
class ConsumidorTeste {
	
	@Test @DisplayName("Percorrer consumer com sucesso.")
	void consumer() {
		Consumidor.forEach(Arrays.asList(1,2,4,5,6), i -> System.out.println(i));
	}
}