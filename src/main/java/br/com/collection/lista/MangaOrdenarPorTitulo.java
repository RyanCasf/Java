package br.com.collection.lista;

import java.util.Comparator;

public class MangaOrdenarPorTitulo implements Comparator<Manga> {
	
	@Override
	public int compare(Manga o1, Manga o2) {
		return o1.getTitulo().compareToIgnoreCase(o2.getTitulo());
	}
}