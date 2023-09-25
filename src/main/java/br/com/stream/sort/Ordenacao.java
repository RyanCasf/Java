package br.com.stream.sort;

import br.com.util.model.Usuario;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ordenacao {
	
	private Ordenacao() {
		throw new IllegalStateException("Classe utilitária!");
	}
	
	public static List<Usuario> ordenarPorId(List<Usuario> usuarios) {
		if (usuarios.isEmpty()) {
			return usuarios;
		}
		
		return usuarios.stream().sorted(Comparator.comparing(Usuario::getCpf)).collect(Collectors.toList());
	}
}