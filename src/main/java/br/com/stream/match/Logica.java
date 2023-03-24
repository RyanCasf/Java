package br.com.stream.match;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import br.com.stream.Pessoa;

public class Logica {
	
	public boolean isTodasPessoaIdMaior10(List<Pessoa> pessoas) {
		return pessoas.stream().allMatch(p -> p.getId() > 10);
	}
	
	public boolean isAlgumaPessoaIdMaior10(List<Pessoa> pessoas) {
		return pessoas.stream().anyMatch(p -> p.getId() > 10);
	}
	
	public boolean isNinguemPessoaIdMaior10(List<Pessoa> pessoas) {
		return pessoas.stream().noneMatch(p -> p.getId() > 10);
	}
	
	public Optional<Pessoa> getPrimeira(List<Pessoa> pessoas) {
		return pessoas.stream()
				.min(Comparator.comparing(Pessoa::getId));
	}
	
	public Optional<Pessoa> getUltimo(List<Pessoa> pessoas) {
		return pessoas.stream()
				.max(Comparator.comparing(Pessoa::getId));
	}
}