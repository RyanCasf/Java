package br.com.stream.filter;

import br.com.util.model.Usuario;

import java.util.List;
import java.util.stream.Collectors;

public class Filtro {
	
	private Filtro() {
		throw new IllegalStateException("Classe utilitária!");
	}
	
	public static List<Usuario> pesquisar(List<Usuario> usuarios, long param) {
		if (usuarios == null) {
			throw new NullPointerException("list null");
		}
		
		if (usuarios.isEmpty()) {
			return usuarios;
		}
		
		return usuarios.stream().filter(p -> p.getId() == param).collect(Collectors.toList());
	}
}