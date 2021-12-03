package br.com.erro;

public class Erro 
{
	public static void main(String[] args) 
	{
		int numero;
		try 
		{
			numero = 10 / 0;
		} 
		catch (Exception e) 
		{
			System.out.println("EXC.: "+e.getMessage());
		}
		catch (Error e) 
		{
			System.out.println("ERO.: "+e.getMessage());
		}
		finally
		{
			System.out.println("FINALLY!");
		}
		
		try 
		{
			System.out.println("\nTENTAR");
			numero = 10 / 0;
		} 
		finally 
		{
			// class error
			System.out.println("ERROR 2 \n");
		}
		
		System.out.println(numero);
		// numero = 10 / 0;
	}
}