package br.com.generic.innerclass;

public class ClasseLocal {
	
	private String nome = "Nome";
	
	public String getNome() {
		final String SOBRENOME = " Last";
		
		class Nome {
			public void printNome() {
				System.out.println(nome + " " + SOBRENOME);
			}
		}
		
		new Nome().printNome();
		return nome;
	}
}