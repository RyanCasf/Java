package br.com.ryan.texto;

public class Textos 
{
	public static void main(String[] args) 
	{
		String entrada1 = "Ryan";
		System.out.println("Olá, meu nome é "+entrada1.toUpperCase()+"!");
		
		// Update in JDK 10v  ->  Deve ser sempre 'inicializada'
		// var entrada2 = "programador Trainne";
		String entrada2 = "programador Trainne";
		System.out.println("Eu trabalho como "+entrada2.toString());
		
		StringBuffer sb = new StringBuffer();
		sb.append("Aguarde 10 anos.");
		System.out.println(sb.toString());
	}
}