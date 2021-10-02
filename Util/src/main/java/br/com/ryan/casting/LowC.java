package br.com.ryan.casting;

public class LowC 
{
	public static void main(String[] args) 
	{
		int numero1 = 10;
		int numero2 = 20;
		
		// ao resultado não converte a operação já feita
		double resultado = (numero1 / (double) numero2);
		
		System.out.println(resultado);
	}
}