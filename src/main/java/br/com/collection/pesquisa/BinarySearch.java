package br.com.collection.pesquisa;

import java.util.Collections;
import java.util.List;

public class BinarySearch {
	
	private List<Integer> inteiros;
	
	public BinarySearch(List<Integer> inteiros) {
		if (inteiros == null)
			throw new NullPointerException("param is null");
		
		this.inteiros = inteiros;
	}
	
	public String buscar(final int INTEIRO) {
		final int INDEX = Collections.binarySearch(inteiros, INTEIRO);
		return "O número " + INTEIRO + " foi encontrado na posição: " + INDEX;
	}
}