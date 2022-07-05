package br.com.functional;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

import br.com.functional.model.Funcionario;
import org.jetbrains.annotations.NotNull;

public class Lambda {

	@NotNull
	public List<String> filter(@NotNull List<String> lista) {
		return lista.stream().filter(l -> l.equalsIgnoreCase("A")).collect(Collectors.toList());
	}

	@NotNull
	public List<String> filterComp(List<Funcionario> funcionarios) {
		return funcionarios.stream()
				.filter(f -> f.getSalario().compareTo(BigDecimal.TEN) >= 0)
				.map(f  -> f.getNome())
				.collect(Collectors.toList());
	}
}