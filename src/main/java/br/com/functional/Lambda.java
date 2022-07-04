package br.com.functional;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

import br.com.functional.model.Funcionario;

public class Lambda {
	
	public List<String> filter(List<String> lista) {
		return lista.stream().filter(l -> l.equalsIgnoreCase("A")).collect(Collectors.toList());
	}
	
	public List<String> filterComp(List<Funcionario> funcionarios) {
		return funcionarios.stream()
				.filter(f -> f.getSalario().compareTo(BigDecimal.TEN) >= 0)
				.map(f  -> f.getNome())
				.collect(Collectors.toList());
	}
}