package br.com.parametro;

public class Carro {
	
	private String cor;
	private int ano;
	
	public Carro(String cor, int ano) {
		this.cor = cor;
		this.ano = ano;
	}
	
	public String getCor() {
		return cor;
	}
	
	public int getAno() {
		return ano;
	}
}