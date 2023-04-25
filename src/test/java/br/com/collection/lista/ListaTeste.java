package br.com.collection.lista;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
@DisplayName("Colletionc: Lista")
class ListaTeste {
	
	private Lista lista;
	
	@BeforeEach
	void comecar() {
		lista = new Lista();
	}
	
	@Test @DisplayName("Ordena��o alfab�tica crescente nula.")
	void ordenarAlfabeticaCrescenteNula() {
		lista.setLista(null);
		assertThrows(NullPointerException.class, () -> lista.crescenteAlfabetica());
	}
	
	@Test @DisplayName("Ordena��o alfab�tica crescente vazia.")
	void ordenarAlfabeticaCrescenteVazia() {
		lista.setLista(new ArrayList<String>());
		assertTrue(lista.crescenteAlfabetica().isEmpty());
	}
	
	@Test @DisplayName("Ordena��o alfab�tica crescente.")
	void ordenarAlfabeticaCrescente() {
		lista.setLista(Arrays.asList("A","C","D","B"));
		assertEquals(Arrays.asList("A","B","C","D"), lista.crescenteAlfabetica());
	}
	
	@Test @DisplayName("Ordena��o mangas nula.")
	void ordenarMangasNula() {
		lista.setListaMangas(null);
		assertThrows(NullPointerException.class, () -> lista.ordenarMangas());
	}
	
	@Test @DisplayName("Ordena��o mangas vazia.")
	void ordenarMangasVazia() {
		lista.setListaMangas(new ArrayList<Manga>());
		assertTrue(lista.ordenarMangas().isEmpty());
	}
	
	@Test @DisplayName("Ordena��o mangas.")
	void ordenarMangas() {
		Manga m1 = new Manga(2l, "C");
		Manga m2 = new Manga(1l, "A");
		Manga m3 = new Manga(3l, "B");
		Manga m4 = new Manga(1l, "a");
		
		lista.setListaMangas(Arrays.asList(m1, m2, m3, m4));
		assertEquals(Arrays.asList(m2, m4, m1, m3), lista.ordenarMangas());
	}
	
	@Test @DisplayName("Ordena��o mangas por t�tulo nula.")
	void ordenarMangasPorTituloNula() {
		lista.setListaMangas(null);
		assertThrows(NullPointerException.class, () -> lista.ordenarMangasPorTitulo());
	}
	
	@Test @DisplayName("Ordena��o mangas por t�tulo vazia.")
	void ordenarMangasPorTituloVazia() {
		lista.setListaMangas(new ArrayList<Manga>());
		assertTrue(lista.ordenarMangasPorTitulo().isEmpty());
	}
	
	@Test @DisplayName("Ordena��o mangas por t�tulo.")
	void ordenarMangasPorTitulo() {
		Manga m1 = new Manga(2l, "C");
		Manga m2 = new Manga(1l, "A");
		Manga m3 = new Manga(3l, "B");
		Manga m4 = new Manga(1l, "a");
		
		lista.setListaMangas(Arrays.asList(m1, m2, m3, m4));
		assertEquals(Arrays.asList(m2, m4, m3, m1), lista.ordenarMangasPorTitulo());
	}
}