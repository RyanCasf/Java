package br.com.construtor;

public abstract class Construtor 
{
	public Construtor()
	{
		System.out.println("Construtor instanciado!");
	}
	
	static
	{
		System.out.println("Construtor estetico!");
	}
	
	public static void main(String[] args) 
	{
		Construtor construtor;
	}
}