package br.com.estatico.aplication;

public class Conta 
{
	private static int chave_conta;
	
	private String nome;
	private String descricao;
	private String senha;
	
	private Pessoa pessoa;
	private java.util.Date data;
	
	public Conta() { Conta.chave_conta++; }
	
	public Conta(String nome) {
		this.nome = nome;
		Conta.chave_conta++; 
	}

	public static int CHAVE_CONTA() { return Conta.chave_conta; }

	public String getNome() { return this.nome; }
	public void setNome(String nome) { this.nome = nome; }

	public String getDescricao() { return this.descricao; }
	public void setDescricao(String descricao) { this.descricao = descricao; }

	public String getSenha() { return this.senha; }
	public void setSenha(String senha) { this.senha = senha; }
	
	public Pessoa getPessoa() { return this.pessoa; }
	public void setPessoa(Pessoa pessoa) { this.pessoa = pessoa; }
	
	public java.util.Date getData() { return this.data; }
	public void setData(java.util.Date data) {
		// 31/2/2021
		this.data = data; 
	}
}