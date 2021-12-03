package br.com.collection.array;

public interface ArrayInterface 
{
	public void adicionar(String elemento);
	public void adicionar(int index, String elemento);
	
	public String obter(String elemento);
	public String obter(int index);
	
	public boolean isVazia();
	public int tamanho();
	
	public void limpar();
	public void excluir(int index);
}