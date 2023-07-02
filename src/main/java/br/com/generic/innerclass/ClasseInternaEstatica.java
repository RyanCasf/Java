package br.com.generic.innerclass;

public class ClasseInternaEstatica {
	
	private String nome = "Nome";
	public static boolean ligado = false;
	
	static class Nested {
		void fazer() {
			System.out.println(new ClasseInternaEstatica().nome + " ");
			ligado = true;
		}
	}
	
	public void iniciar() {
		Nested nested = new Nested();
		nested.fazer();
	}
}