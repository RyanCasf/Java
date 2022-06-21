package br.com.geometria;

/**
 * Sub Classe real Cubo
 * 
 * @author Ryan Castro Ferreira
 */
public class Cubo extends Quadrilatero {

	private int altura;
	
	public Cubo() {}
	
	public Cubo(int lado1, int lado2, int altura) {
		super.setLado1(lado1);
		super.setLado2(lado2);
		this.altura = altura;
	}
	
	public String getDadosFormatados() {
		return super.getDadosFormatados();
	}
	
	public double getVolume() {
		return (double) this.altura * getLado1() * getLado2();
	}
	
	public boolean isCuboPerfeito() {
		return (this.altura == getLado1() && getLado1() == getLado2());
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	public int getAltura() {
		return this.altura;
	}
	
	public void setAltura(int altura) {
		this.altura = altura;
	}
}