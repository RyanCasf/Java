package br.com.construtor;

public abstract class Construtor 
{
	public Construtor()
	{
		System.out.println("Construtor instânciado!");
	}
	
	static
	{
		System.out.println("Construtor estático!");
	}
	
	public static void main(String[] args) 
	{
		Construtor c;
	}
}