package br.com.pattern.enumeradores;

public enum Enumerador {
	
	MASCULINO('M'),
	FEMININO('F');
	
	private final char sexo;
	
	Enumerador(char sexo) {
		this.sexo = sexo;
	}
	
	public char getSexo() {
		return sexo;
	}
}