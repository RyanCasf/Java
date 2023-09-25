package br.com.stream.group;

import br.com.util.model.Usuario;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Grupo {
	
	private Grupo() {
		throw new IllegalStateException("Classe utilitária!");
	}
	
	public static Map<Boolean, List<Usuario>> separarEmGrupo(List<Usuario> usuarios) {
		if (usuarios == null) {
			throw new NullPointerException("list null");
		}
		
		return usuarios.stream()
				.collect(Collectors.groupingBy(Usuario::isCancelado));
	}
}