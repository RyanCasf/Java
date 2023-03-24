package br.com.stream;

public class Pessoa {
	
	private long id;
	private String nome;
	private String nomeFantasia;
	private boolean cancelado = false;
	
	public Pessoa(long id, String nome, String nomeFantasia, boolean cancelado) { 
		this.id = id;
		this.nome = nome;
		this.nomeFantasia = nomeFantasia;
		this.cancelado = cancelado;
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	
	public boolean isCancelado() {
		return cancelado;
	}

	public void setCancelado(boolean cancelado) {
		this.cancelado = cancelado;
	}
	
	@Override
	public String toString() {
		return id + " | " + nome + " - " + nomeFantasia;
	}
}