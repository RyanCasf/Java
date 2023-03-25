package br.com.stream.match;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import br.com.stream.Pessoa;

public class Logica {
	
	private Logica() {
		throw new IllegalStateException("Classe utilitária!");
	}
	
	public static boolean isTodasPessoaIdMaior10(List<Pessoa> pessoas) {
		if (pessoas == null) {
			throw new NullPointerException("list null");
		}
		
		return pessoas.stream().allMatch(p -> p.getId() > 10);
	}
	
	public static boolean isAlgumaPessoaIdMaior10(List<Pessoa> pessoas) {
		if (pessoas == null) {
			throw new NullPointerException("list null");
		}
		
		return pessoas.stream().anyMatch(p -> p.getId() > 10);
	}
	
	public static boolean isNinguemPessoaIdMaior10(List<Pessoa> pessoas) {
		if (pessoas == null) {
			throw new NullPointerException("list null");
		}
		
		return pessoas.stream().noneMatch(p -> p.getId() > 10);
	}
	
	public static Optional<Pessoa> pegarMenorId(List<Pessoa> pessoas) {
		if (pessoas == null) {
			throw new NullPointerException("list null");
		}
		
		return pessoas.stream()
				.min(Comparator.comparing(Pessoa::getId));
	}
	
	public static Optional<Pessoa> pegarMaiorId(List<Pessoa> pessoas) {
		if (pessoas == null) {
			throw new NullPointerException("list null");
		}
		
		return pessoas.stream()
				.max(Comparator.comparing(Pessoa::getId));
	}
}