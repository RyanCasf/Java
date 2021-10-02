package br.com.ryan.tipo.primitivo;

public class Char 
{
	public static void main(String[] args) 
	{
		byte estouro = 127;
		System.out.println(estouro++);  // 127 / -128
		System.out.println(++estouro);  // -127 inveter
		System.out.println(++estouro); // -126
		
		char letra = 65;
		System.out.println(letra);
		
		String daleTxt = "Dale";
		for (char a : daleTxt.toCharArray())
		{
			System.out.print(a);
		}
	}
}