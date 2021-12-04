package br.com.collection.array;

public class Array implements ArrayInterface
{
	private String[] array;
	private int posicao;
	
	public Array(int capacidade) 
	{
		capacidade = estoutoMemoriaCapacidade(capacidade);
		array = new String[capacidade];
		posicao = 0;
	}
	
	public void adicionar(String elemento) 
	{
		for (int i=posicao; i<tamanho(); i++) 
		{
			if (array[i] == null)
			{
				posicao = i+1;
				array[i] = elemento;
				break;
			}
		}
	}
	
	public String obter(int index)
	{
		return index >= 0 && index <= tamanho() ? array[index] : null;
	}
	
	public int tamanho()
	{
		return array.length;
	}
	
	private int estoutoMemoriaCapacidade(int capacidade) {
		try 
		{
			if (capacidade <= 0) {
				capacidade = capacidade * -1;
			}
		}
		catch (OutOfMemoryError e) 
		{
			System.out.println(Integer.MAX_VALUE);
			capacidade = Integer.MAX_VALUE;
		}
		return capacidade;
	}
}