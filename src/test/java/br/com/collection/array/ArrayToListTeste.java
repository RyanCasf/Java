package br.com.collection.array;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
@DisplayName("Array To List")
class ArrayToListTeste {
	
	@Test @DisplayName("asList nula.")
	void asListNula() {
		assertThrows(NullPointerException.class, () -> ArrayToList.asList(null));
	}
	
	@Test @DisplayName("asList.")
	void asList() {
		ArrayToList.asList(Arrays.asList(1,2,5,6));
	}
}