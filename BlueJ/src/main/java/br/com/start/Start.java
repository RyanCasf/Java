package br.com.start;

public class Start 
{
	public final static long serializabel = 01l;
	
	public static void main(String[] args) 
	{
		Start start;			// Defini��o - Est�ticos
		// start.hello();
		start = new Start();	// Constru��o - N�o est�tico
		start.hello();
	}
	
	public void hello()
	{
		System.out.println("Hello");
	}
}