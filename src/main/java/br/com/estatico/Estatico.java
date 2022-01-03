package br.com.estatico;

public class Estatico 
{
	private static int ID = Integer.valueOf(0);
	
	public Estatico() {
		Estatico.ID++;
	}
	
	public static int getId() {
		return ID;
	}
	
	public static void main(String[] args) 
	{
		System.out.println(Estatico.getId());
		System.out.println(Estatico.getId());
		
		System.out.println(Estatico.getId());
		
		System.out.println(Estatico.getId()); // 1
		
		// System.out.println(new Estatico().getId()); // 2
	}
}