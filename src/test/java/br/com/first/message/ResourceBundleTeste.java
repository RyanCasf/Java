package br.com.first.message;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
@DisplayName("First: Resource Bundle")
class ResourceBundleTeste {
	
	@Test @DisplayName("Pegar hello em inglês.")
	void getHello() {
		assertEquals("Hello", new ResourceBundle().getHello());
	}
	
	@Test @DisplayName("Pegar goodMorning em inglês.")
	void getGoodMorning() {
		assertEquals("Good Morning", new ResourceBundle().getGoodMornig());
	}
}