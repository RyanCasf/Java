package br.com.collection.array;

public class Array implements ArrayInterface
{
	private int capacidade;
	private String[] array;
	
	public Array(int capacidade) 
	{
		capacidade = estoutoMemoriaCapacidade(capacidade);
		array = new String[capacidade];
	}
	
	public void adicionar(String elemento) 
	{
		array[0] = elemento.toString();
	}

	public void adicionar(int index, String elemento) 
	{
		array[index] = elemento;
	}

	public String obter(String elemento) 
	{
		
		return null;
	}

	public String obter(int index) 
	{
		return array[index].toString();
	}

	public boolean isVazia() 
	{
		
		return false;
	}

	public int tamanho()
	{
		return array.length-1;
	}
	
	public void limpar() 
	{
		for (String s : array)
		{
			s = "";
		}
	}

	public void excluir(int index) 
	{
		if (index <= tamanho()) 
		{
			array[index] = null;
		}
	}
	
	private int estoutoMemoriaCapacidade(int capacidade) {
		try 
		{
			if (capacidade <= 0) {
				capacidade = capacidade * -1;
			}
			
			this.capacidade = capacidade;
		}
		catch (OutOfMemoryError e) 
		{
			System.out.println(Integer.MAX_VALUE);
			capacidade = Integer.MAX_VALUE;
		}
		return capacidade;
	}
}