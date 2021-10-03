package br.com.ryan.estaticolazy;

import java.util.ArrayList;
import java.util.List;

public class Estatico 
{
	private String nome;
	private static List<Object> lista = new ArrayList<Object>();
	
	static
	{
		lista.add(1);
		lista.add(18);
		lista.add(10);
	}
	
	{
		nome = "Ryan";
	}

	public String getNome() {
		return nome;
	}

	public static List<Object> getLista() {
		return lista;
	}

	public static String toStringStatic() 
	{
		return "Estatico\n"
			+ "[Lista : " + getLista() + "]";
	}

	@Override
	public String toString() 
	{
		return "Estatico\n[Nome : " + nome 
			+", Lista : " +getLista() + "]";
	}
}