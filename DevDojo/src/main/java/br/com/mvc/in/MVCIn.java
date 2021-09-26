package br.com.mvc.in;

import java.util.Objects;

public class MVCIn 
{
	public static void main(String a[]) 
	{
		Model model = fetchModel(1l, "A");
		Model modelTemp = fetchModel(1l, "B");
		
		if (model.equals(modelTemp))
		{
			model.setChave(model.getChave() + 1);
		}
		
		System.out.println(model.toString());
	}

	private static Model fetchModel(Long valor, String conteudo) 
	{
		Model model = new Model();
		model.setChave(valor);
		model.setConteudo(conteudo);
		return model;
	}
}
class Model
{
	private Long chave;
	private String conteudo;
	
	public Long getChave() {
		return chave;
	}
	
	public void setChave(Long chave) {
		this.chave = chave;
	}
	
	public String getConteudo() {
		return conteudo;
	}
	
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	@Override
	public String toString() 
	{
		return "[chave="+chave+", conteudo=" + conteudo + "]";
	}

	@Override
	public int hashCode() 
	{
		return Objects.hash(chave);
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Model other = (Model) obj;
		return Objects.equals(chave, other.chave);
	}
}