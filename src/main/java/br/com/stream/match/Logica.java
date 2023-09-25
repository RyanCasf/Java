package br.com.stream.match;

import br.com.util.model.Usuario;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Logica {
	
	private Logica() {
		throw new IllegalStateException("Classe utilitária!");
	}
	
	public static boolean isTodasPessoaIdMaior10(List<Usuario> usuarios) {
		if (usuarios == null) {
			throw new NullPointerException("list null");
		}
		
		return usuarios.stream().allMatch(p -> p.getId() > 10);
	}
	
	public static boolean isAlgumaPessoaIdMaior10(List<Usuario> usuarios) {
		if (usuarios == null) {
			throw new NullPointerException("list null");
		}
		
		return usuarios.stream().anyMatch(p -> p.getId() > 10);
	}
	
	public static boolean isNinguemPessoaIdMaior10(List<Usuario> usuarios) {
		if (usuarios == null) {
			throw new NullPointerException("list null");
		}
		
		return usuarios.stream().noneMatch(p -> p.getId() > 10);
	}
	
	public static Optional<Usuario> pegarMenorId(List<Usuario> usuarios) {
		if (usuarios == null) {
			throw new NullPointerException("list null");
		}
		
		return usuarios.stream()
				.min(Comparator.comparing(Usuario::getId));
	}
	
	public static Optional<Usuario> pegarMaiorId(List<Usuario> pessoas) {
		if (pessoas == null) {
			throw new NullPointerException("list null");
		}
		
		return pessoas.stream()
				.max(Comparator.comparing(Usuario::getId));
	}
}