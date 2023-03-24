package br.com.stream.group;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import br.com.stream.Pessoa;

public class Grupo {
	
	public Map<Boolean, List<Pessoa>> separarEmGrupo(List<Pessoa> pessoas) {
		return pessoas.stream()
				.collect(Collectors.groupingBy(Pessoa::isCancelado));
	}
}