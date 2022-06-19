package br.com.functional.model;

import java.math.BigDecimal;

public class Funcionario {
	private String nome;
	private String cargo;
	private BigDecimal salario;
	
	public Funcionario(String nome, String cargo, Number salario) {
		super();
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario != null ? BigDecimal.valueOf(salario.doubleValue()) : null;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCargo() {
		return cargo;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public BigDecimal getSalario() {
		return salario;
	}
	
	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}
}