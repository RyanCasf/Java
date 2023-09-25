package br.com.stream.match;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import br.com.util.model.Usuario;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
@DisplayName("Stream: Lógica")
class LogicaTeste {
	
	@Test @DisplayName("Todas as pessoas com id maior que 10 nula.")
	void todasPessoasComIDMaiorQue10Nula() {
		assertThrows(NullPointerException.class, () -> Logica.isTodasPessoaIdMaior10(null));
	}
	
	@Test @DisplayName("Todas as pessoas com id maior que 10 vazio.")
	void todasPessoasComIDMaiorQue10Vazio() {
		assertDoesNotThrow(() -> Logica.isTodasPessoaIdMaior10(new ArrayList<>()));
	}
	
	@Test @DisplayName("Todas as pessoas com id maior que 10 falso.")
	void todasPessoasComIDMaiorQue10Falso() {
		List<Usuario> usuarios = List.of(
				new Usuario(1, "A", "a", false),
				new Usuario(3, "A", "a", false),
				new Usuario(8, "A", "a", false),
				new Usuario(10, "A", "a", false)
		);
		
		assertFalse(Logica.isTodasPessoaIdMaior10(usuarios));
	}
	
	@Test @DisplayName("Todas as pessoas com id maior que 10 falso com algum maior.")
	void todasPessoasComIDMaiorQue10FalsoComUm() {
		List<Usuario> usuarios = List.of(
				new Usuario(1, "A", "a", false),
				new Usuario(8, "A", "a", false),
				new Usuario(21, "A", "a", false)
		);
		
		assertFalse(Logica.isTodasPessoaIdMaior10(usuarios));
	}
	
	@Test @DisplayName("Todas as pessoas com id maior que 10 verdadeiro.")
	void todasPessoasComIDMaiorQue10Verdadeiro() {
		List<Usuario> usuarios = List.of(
				new Usuario(11, "A", "a", false),
				new Usuario(21, "A", "a", false)
		);
		
		assertTrue(Logica.isTodasPessoaIdMaior10(usuarios));
	}
	
	@Test @DisplayName("Alguma pessoa com id maior que 10 nula.")
	void algumaPessoaComIDMaiorQue10Nulo() {
		assertThrows(NullPointerException.class, () -> Logica.isAlgumaPessoaIdMaior10(null));
	}
	
	@Test @DisplayName("Alguma pessoa com id maior que 10 nula.")
	void algumaPessoaComIDMaiorQue10Vazio() {
		assertDoesNotThrow(() -> Logica.isAlgumaPessoaIdMaior10(new ArrayList<>()));
	}
	
	@Test @DisplayName("Alguma pessoa com id maior que 10 falso.")
	void algumaPessoaComIDMaiorQue10Falso() {
		List<Usuario> usuarios = List.of(
				new Usuario(10, "A", "a", false),
				new Usuario(2, "A", "a", false),
				new Usuario(3, "A", "a", false),
				new Usuario(4, "A", "a", false),
				new Usuario(1, "A", "a", false)
		);
		
		assertFalse(Logica.isAlgumaPessoaIdMaior10(usuarios));
	}
	
	@Test @DisplayName("Alguma pessoa com id maior que 10 verdadeiro.")
	void algumaPessoaComIDMaiorQue10Verdadeiro() {
		List<Usuario> usuarios = List.of(
				new Usuario(11, "A", "a", false),
				new Usuario(2, "A", "a", false),
				new Usuario(3, "A", "a", false),
				new Usuario(4, "A", "a", false),
				new Usuario(1, "A", "a", false)
		);
		
		assertTrue(Logica.isAlgumaPessoaIdMaior10(usuarios));
	}
	
	@Test @DisplayName("Ninguém com id maior do que 10 nula.")
	void ninguemComIDMaiorQue10Nulo() {
		assertThrows(NullPointerException.class, () -> Logica.isNinguemPessoaIdMaior10(null));
	}
	
	@Test @DisplayName("Ninguém com id maior do que 10 vazio.")
	void ninguemComIDMaiorQue10Vazio() {
		assertDoesNotThrow(() -> Logica.isNinguemPessoaIdMaior10(new ArrayList<>()));
	}
	
	@Test @DisplayName("Ninguém com id maior do que 10 verdadeiro.")
	void ninguemComIDMaiorQue10Verdadeiro() {
		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(new Usuario(1, "Nome A", "nomeA", false));
		usuarios.add(new Usuario(2, "Nome B", "nomeB", false));
		usuarios.add(new Usuario(3, "Nome C", "nomeC", false));
		
		assertTrue(Logica.isNinguemPessoaIdMaior10(usuarios));
	}
	
	@Test @DisplayName("Ninguém com id maior do que 10 falso.")
	void ninguemComIDMaiorQue10Falso() {
		List<Usuario> pessoas = new ArrayList<>();
		pessoas.add(new Usuario(9, "Nome A", "nomeA", false));
		pessoas.add(new Usuario(10, "Nome B", "nomeB", false));
		pessoas.add(new Usuario(11, "Nome C", "nomeC", false));
		
		assertFalse(Logica.isNinguemPessoaIdMaior10(pessoas));
	}
	
	@Test @DisplayName("Alguém com id maior do que 10 falso.")
	void alguemComIDMaiorQue10Falso() {
		List<Usuario> pessoas = List.of(
				new Usuario(10, "A", "a", false),
				new Usuario(2, "A", "a", false),
				new Usuario(3, "A", "a", false),
				new Usuario(4, "A", "a", false),
				new Usuario(1, "A", "a", false)
		);
		
		assertFalse(Logica.isAlgumaPessoaIdMaior10(pessoas));
	}
	
	@Test @DisplayName("Ninguém com id maior do que 10 verdadeiro.")
	void alguemComIDMaiorQue10Verdadeiro() {
		List<Usuario> pessoas = List.of(
				new Usuario(10, "A", "a", false),
				new Usuario(2, "A", "a", false),
				new Usuario(3, "A", "a", false),
				new Usuario(4, "A", "a", false),
				new Usuario(11, "A", "a", false)
		);
		
		assertTrue(Logica.isAlgumaPessoaIdMaior10(pessoas));
	}
	
	@Test @DisplayName("Pegar primeiro nulo.")
	void getPrimeiraNula() {
		assertThrows(NullPointerException.class, () -> Logica.pegarMenorId(null));
	}
	
	@Test @DisplayName("Pegar primeiro único.")
	void getPrimeiraUnico() {
		List<Usuario> pessoas = List.of(
				new Usuario(1, "A", "a", false)
		);
		
		assertEquals(1, Logica.pegarMenorId(pessoas).get().getId());
	}
	
	@Test @DisplayName("Pegar primeiro.")
	void getPrimeira() {
		List<Usuario> pessoas = List.of(
				new Usuario(0, "A", "a", false),
				new Usuario(2, "A", "a", false),
				new Usuario(3, "A", "a", false),
				new Usuario(4, "A", "a", false),
				new Usuario(1, "A", "a", false)
		);
		
		assertEquals(0, Logica.pegarMenorId(pessoas).get().getId());
	}
	
	@Test @DisplayName("Pegar primeiro duplo.")
	void getPrimeiraDuplo() {
		List<Usuario> pessoas = List.of(
				new Usuario(0, "A", "a", false),
				new Usuario(0, "A", "a", false)
		);
		
		assertEquals(0, Logica.pegarMenorId(pessoas).get().getId());
	}
	
	@Test @DisplayName("Pegar último nulo.")
	void getUltimoNulo() {
		assertThrows(NullPointerException.class, () -> Logica.pegarMaiorId(null));
	}
	
	@Test @DisplayName("Pegar último único.")
	void getUltimoUnico() {
		List<Usuario> pessoas = List.of(
				new Usuario(1, "A", "a", false)
		);
		
		assertEquals(1, Logica.pegarMaiorId(pessoas).get().getId());
	}
	
	@Test @DisplayName("Pegar último.")
	void getUltimo() {
		List<Usuario> pessoas = List.of(
				new Usuario(0, "A", "a", false),
				new Usuario(2, "A", "a", false),
				new Usuario(3, "A", "a", false),
				new Usuario(4, "A", "a", false),
				new Usuario(1, "A", "a", false)
		);
		
		assertEquals(4, Logica.pegarMaiorId(pessoas).get().getId());
	}
	
	@Test @DisplayName("Pegar último duplo.")
	void getUltimoDuplo() {
		List<Usuario> pessoas = List.of(
				new Usuario(4, "A", "a", false),
				new Usuario(4, "A", "a", false)
		);
		
		assertEquals(4, Logica.pegarMaiorId(pessoas).get().getId());
	}
}