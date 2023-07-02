package br.com.generic.innerclass;

public class ClasseInterna {
	
	private String nome = "Nome";
	
	public class ClasseDentro {
		public String getNome() {
			return nome;
		}
	}
}