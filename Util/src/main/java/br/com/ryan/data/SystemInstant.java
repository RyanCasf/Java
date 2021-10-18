package br.com.ryan.data;

public class SystemInstant 
{
	private static long inicio = System.nanoTime(); // instante since 01/01/1970
	
	public static void main(String[] args) 
	{
		try 
		{
			Thread.sleep(1000);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}

		System.out.println("Segundos: "+((System.nanoTime() - inicio) / 100000000) % 60);
	}
}