package br.com.stream.sort;

import java.util.Comparator;
import java.util.List;

import br.com.stream.Pessoa;

public class Ordenacao {
	
	public void ordenarPorId(List<Pessoa> pessoas) {
		pessoas.sort(Comparator.comparing(Pessoa::getId));
	}
}