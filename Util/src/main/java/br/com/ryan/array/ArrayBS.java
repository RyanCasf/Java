package br.com.ryan.array;

public class ArrayBS 
{
	private final static byte tamanho = 4;
	private static String[] nomes = new String[tamanho];
	
	public ArrayBS()
	{
		int i = 0;
		nomes[i++] = "R";
		nomes[i++] = "Y";
		nomes[i++] = "A";
		nomes[i++] = "N";
	}
	
	public static void main(String[] args) 
	{
		for (String nome : ArrayBS.getNomes())
		{
			System.out.print(nome);
		}
	}

	public static String[] getNomes() {
		return nomes;
	}

	public static void setNomes(String[] nomes) {
		ArrayBS.nomes = nomes;
	}
}