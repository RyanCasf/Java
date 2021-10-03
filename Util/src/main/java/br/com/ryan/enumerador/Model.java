package br.com.ryan.enumerador;

public enum Model 
{
	TODOS("Todos"),
	NENHUM("Nenhum");

	private String descricao;
	Model(String string) 
	{
		this.descricao = string;
	}
	
	public String getDescricao() {
		return descricao;
	}
}