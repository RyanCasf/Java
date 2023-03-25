package br.com.stream.sort;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import br.com.stream.Pessoa;

public class Ordenacao {
	
	private Ordenacao() {
		throw new IllegalStateException("Classe utilitária!");
	}
	
	public static List<Pessoa> ordenarPorId(List<Pessoa> pessoas) {
		if (pessoas == null) {
			throw new NullPointerException("list null");
		}
		
		if (pessoas.isEmpty()) {
			return pessoas;
		}
		
		return pessoas.stream().sorted(Comparator.comparing(Pessoa::getId)).collect(Collectors.toList());
	}
}