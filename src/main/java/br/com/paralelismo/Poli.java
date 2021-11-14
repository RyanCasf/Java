package br.com.paralelismo;

public class Poli 
{
	public static void main(String[] args) 
	{
		long inicio = System.nanoTime();
		new EventoIs().start(); 				// IS  - A
		new EventoHas().thread.start();	// HAS - A
		
		System.out.println("Aqui em.: "+(((System.nanoTime() - inicio) / 100 ) % 60));
	}
}

class EventoIs extends Thread
{
	@Override
	public void run()
	{
		for (int i=0; i<10; i++)
		{
			System.out.println(this.getClass()+" - "+i+" |");
		}
	}
}

class EventoHas implements Runnable
{
	public Thread thread = new Thread(this);
	
	public void run() 
	{
		// TODO Auto-generated method stub
		for (int i=0; i<10; i++)
		{
			System.out.println(this.getClass()+" - "+i+" |");
		}
	}
}