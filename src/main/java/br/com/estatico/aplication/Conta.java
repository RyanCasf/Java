package br.com.estatico.aplication;

import java.util.GregorianCalendar;

public class Conta {
	private static int chaveConta;
	private String nome;
	private String descricao;
	private String senha;

	private Pessoa pessoa;
	private java.util.Date data;

	public Conta() {
		Conta.chaveConta++;
	}

	public Conta(String nome) {
		this.nome = nome;
		Conta.chaveConta++;
	}

	public static int CHAVE_CONTA() {
		return Conta.chaveConta;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getSenha() {
		return this.senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Pessoa getPessoa() {
		return this.pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public java.util.Date getData() {
		return this.data;
	}

	public void setData(java.util.Date data) {
		GregorianCalendar gc = new GregorianCalendar(2021, 2, 31);
		if (data.equals(gc.getTime())) {
			this.data = null;
		}

		this.data = data;
	}
}