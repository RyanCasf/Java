package br.com.util.model;

import java.io.Serializable;

public class Usuario implements Serializable {

	private Integer id;
	private String login;
	private String senha;
	private String cpf;

	private transient boolean cancelado;

	public Usuario() {
		super();
	}

	public Usuario(String login, String senha, String cpf) {
		this.login = login;
		this.senha = senha;
		this.cpf = cpf;
	}

	public Usuario(Integer id, String login, String senha, String cpf) {
		this(login, senha, cpf);
		this.id = id;
	}

	public Usuario(Integer id, String login, String senha, boolean cancelado) {
		this.id = id;
		this.login = login;
		this.senha = senha;
		this.cancelado = cancelado;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public boolean isCancelado() {
		return cancelado;
	}

	public void setCancelado(boolean cancelado) {
		this.cancelado = cancelado;
	}
}