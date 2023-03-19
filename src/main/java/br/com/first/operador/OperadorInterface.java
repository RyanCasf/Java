package br.com.first.operador;

public interface OperadorInterface {
	
	public double somar(double... numeros) throws NullPointerException;
	public double subtrair(double numero1, double numero2);
	public double multiplicar(double... numeros) throws NullPointerException;
}