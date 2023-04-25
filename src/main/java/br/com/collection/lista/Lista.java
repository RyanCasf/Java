package br.com.collection.lista;

import java.util.Collections;
import java.util.List;

public class Lista {
	
	private List<String> lista;
	private List<Manga> listaMangas;
	
	public List<String> crescenteAlfabetica() {
		Collections.sort(lista);
		return lista;
	}
	
	public List<Manga> ordenarMangas() {
		Collections.sort(listaMangas);
		return listaMangas;
	}
	
	public List<Manga> ordenarMangasPorTitulo() {
		Collections.sort(listaMangas, new MangaOrdenarPorTitulo());
		return listaMangas;
	}
	
	public void setLista(List<String> lista) {
		this.lista = lista;
	}
	
	public void setListaMangas(List<Manga> listaMangas) {
		this.listaMangas = listaMangas;
	}
}