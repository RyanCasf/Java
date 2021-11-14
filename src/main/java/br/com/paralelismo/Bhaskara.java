package br.com.paralelismo;

import java.math.BigDecimal;

public class Bhaskara
{
	private BigDecimal a, b, c;
	
	public static void main(String[] args) 
	{
		Bhaskara b = new Bhaskara();
		b.obterEntradas();
	}
	
	public void obterEntradas()
	{
		try
		{
			a = new BigDecimal("0.0");
			b = c = a;
			
			System.out.println("A.: "+a+"\nB.: "+b+"\nC.: "+c);
		}
		catch (Exception e) 
		{
			
		}
	}
	
	public Bhaskara()
	{
		// -b +/- sqrt(b^2 - 4 * a * c) / 2 * a
		System.out.println("B H A S K A R A\n");
	}
}