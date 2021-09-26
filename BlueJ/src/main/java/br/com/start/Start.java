package br.com.start;

public class Start 
{
	public final static long serializabel = 01l;
	
	public static void main(String[] args) 
	{
		Start start;			// Definição - Estáticos
		// start.hello();
		start = new Start();	// Construção - Não estático
		start.hello();
	}
	
	public void hello()
	{
		System.out.println("Hello");
	}
}