package br.com.geometria;

/**
 * Classe abstrata para conex?es de F?guras
 * 
 * @author Ryan Castro Ferreira
 */
public abstract class FiguraPlanaAbstract {
	
	private int lado1;
	private int lado2;
	
	/**
	 * Sa?da padr?o dos dados das F?guras Planas
	 */
	public String getDadosFormatados() {
		return "Lado 1.: " + lado1 + "\nLado 2.: " + lado2;
	}
	
	/**
	 * Contrato para calculo da area
	 * 
	 * @deprecated to Interface
	 */
	public abstract double getArea();

	/**
	 * Contrato para calculo de Perimetro
	 * 
	 * @deprecated to Interface
	 */
	public abstract double getPerimetro();
	
	/**
	 * Retorno unido padr?o geral da Classe
	 */
	@Override
	public String toString() {
		return this.getDadosFormatados();
	}
	
	public int getLado1() {
		return lado1;
	}
	
	public void setLado1(int lado1) {
		this.lado1 = lado1;
	}
	
	public int getLado2() {
		return lado2;
	}
	
	public void setLado2(int lado2) {
		this.lado2 = lado2;
	}
}