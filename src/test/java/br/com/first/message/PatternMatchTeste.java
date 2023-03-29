package br.com.first.message;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
@DisplayName("First: Pattern Match")
class PatternMatchTeste {
	
	@Test @DisplayName("Regex search param null.")
	void regexSearchNull() {
		assertThrows(IllegalArgumentException.class, () -> PatternMatch.regexSearch(null));
	}
	
	@Test @DisplayName("Regex search param empty.")
	void regexSearchEmpty() {
		assertThrows(IllegalArgumentException.class, () -> PatternMatch.regexSearch(""));
		assertFalse(PatternMatch.regexSearch("     "));
	}
	
	@Test @DisplayName("Regex search param invalid.")
	void regexSearchInvalid() {
		assertFalse(PatternMatch.regexSearch("123"));
	}
	
	@Test @DisplayName("Regex search param.")
	void regexSearch() {
		assertTrue(PatternMatch.regexSearch("Lorem"));
	}
	
	@Test @DisplayName("Hexadecimal param null.")
	void isHexadecimalNull() {
		assertThrows(IllegalArgumentException.class, () -> PatternMatch.isHexadecimal(null));
	}
	
	@Test @DisplayName("Hexadecimal param empty.")
	void isHexadecimalEmpty() {
		assertThrows(IllegalArgumentException.class, () -> PatternMatch.regexSearch(""));
		assertFalse(PatternMatch.isHexadecimal("     "));
	}
	
	@Test @DisplayName("Hexadecimal param inválido.")
	void isHexadecimalInvalid() {
		assertThrows(IllegalArgumentException.class, () -> PatternMatch.regexSearch(""));
		assertFalse(PatternMatch.isHexadecimal("0x"));
	}
	
	@Test @DisplayName("Hexadecimal param.")
	void isHexadecimal() {
		assertThrows(IllegalArgumentException.class, () -> PatternMatch.regexSearch(""));
		assertTrue(PatternMatch.isHexadecimal("0x1 "));
	}
}