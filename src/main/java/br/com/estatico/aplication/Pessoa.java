package br.com.estatico.aplication;

public class Pessoa 
{
	private Long chave;
	
	private String nome;
	private String nomeFantasia;
	private String cpf;
	
	public Long getChave() { return this.chave; }
	public void setChave(Long chave) { this.chave = chave; }
	
	public String getNome() { return this.nome; }
	public void setNome(String nome) { this.nome = nome; }
	
	public String getNomeFantasia() { return this.nomeFantasia; }
	public void setNomeFantasia(String nomeFantasia) { this.nomeFantasia = nomeFantasia; }
	
	public String getCpf() { return this.cpf; }
	public void setCpf(String cpf) { this.cpf = cpf; }
}