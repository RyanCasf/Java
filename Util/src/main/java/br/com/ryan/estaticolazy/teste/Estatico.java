package br.com.ryan.estaticolazy.teste;

import org.junit.jupiter.api.Test;

public class Estatico 
{
	@Test
	public void gerarInicializador()
	{
		br.com.ryan.estaticolazy.Estatico estatico;
		estatico = new br.com.ryan.estaticolazy.Estatico();
		
		System.out.println(br.com.ryan.estaticolazy.Estatico.toStringStatic());
		System.out.println(estatico.toString());
	}
}