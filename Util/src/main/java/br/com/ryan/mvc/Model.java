package br.com.ryan.mvc;

public class Model 
{
	private String valor;
	
	public Model() {}
	
	public Model(String valor)
	{
		this.valor = valor;
	}
	
	public String getValor() {
		return valor;
	}
	
	public void setValor(String valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Model [valor=" + valor + "]";
	}
}