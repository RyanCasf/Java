package br.com.strategy;

import java.io.Serializable;
import java.math.BigDecimal;

public class Venda implements Serializable {
	private Funcionario funcionario;
	private BigDecimal valor;

	public void vender(Funcionario funcionario, BigDecimal valor) {
		if (funcionario == null || funcionario.getCargo() == null || valor == null) {
			return;
		}
		
		this.funcionario = funcionario;
		this.valor = BigDecimal.valueOf(funcionario.getCargo().calculaComissao(valor.doubleValue()));
	}
	
	public void novo() {
		funcionario = null;
		valor= null;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
}