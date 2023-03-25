package br.com.stream.group;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import br.com.stream.Pessoa;

public class Grupo {
	
	private Grupo() {
		throw new IllegalStateException("Classe utilitária!");
	}
	
	public static Map<Boolean, List<Pessoa>> separarEmGrupo(List<Pessoa> pessoas) {
		if (pessoas == null) {
			throw new NullPointerException("list null");
		}
		
		return pessoas.stream()
				.collect(Collectors.groupingBy(Pessoa::isCancelado));
	}
}