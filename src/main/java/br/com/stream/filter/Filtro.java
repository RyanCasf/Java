package br.com.stream.filter;

import java.util.List;
import java.util.stream.Collectors;

import br.com.stream.Pessoa;

public class Filtro {
	
	public List<Pessoa> pesquisar(List<Pessoa> pessoas, long param) {
		return pessoas.stream().filter(p -> p.getId() == param).collect(Collectors.toList());
	}
}