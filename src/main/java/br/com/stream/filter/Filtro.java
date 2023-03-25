package br.com.stream.filter;

import java.util.List;
import java.util.stream.Collectors;

import br.com.stream.Pessoa;

public class Filtro {
	
	private Filtro() {
		throw new IllegalStateException("Classe utilitária!");
	}
	
	public static List<Pessoa> pesquisar(List<Pessoa> pessoas, long param) {
		if (pessoas == null) {
			throw new NullPointerException("list null");
		}
		
		if (pessoas.isEmpty()) {
			return pessoas;
		}
		
		return pessoas.stream().filter(p -> p.getId() == param).collect(Collectors.toList());
	}
}