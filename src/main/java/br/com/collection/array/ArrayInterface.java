package br.com.collection.array;

public interface ArrayInterface 
{
	public void adicionar(String elemento) throws Exception;
	public void adicionar(int index, String elemento) throws Exception;
	
	public String obter(int index);
	
	public int tamanho();
}