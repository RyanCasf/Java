package br.com.geometria;

/**
 * Super Classe real do Quadrilátero
 * 
 * @author Ryan Castro Ferreira
 */
public class Quadrilatero extends FiguraPlanaAbstract implements FiguraPlanaInterface {

	public Quadrilatero() {}
	
	public Quadrilatero(int lado1, int lado2) {
		super.setLado1(lado1);
		super.setLado2(lado2);
	}
	
	@Override
	public String getDadosFormatados() {
		return super.getDadosFormatados() + ".";
	}
	
	@Override
	public double getArea() {
		return (double) getLado1() * getLado2();
	}

	@Override
	public double getPerimetro() {
		return (double) (getLado1() * 2) + (getLado2() * 2);
	}
	
	public boolean isQuadrado() {
		return getLado1() == getLado2();
	}
	
	public boolean isRetangulo() {
		return getLado1() != getLado2();
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}