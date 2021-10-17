package br.com.ryan.generic;

public class Orange 
{
	private String codigo;
	private String descricao;
	private boolean excluido = false;
	
	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public boolean isExcluido() {
		return excluido;
	}
	
	public void setExcluido(boolean excluido) {
		this.excluido = excluido;
	}
}