package br.com.first.heranca;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Funcionario extends Pessoa {
	
	private BigDecimal salario;
	
	public Funcionario(final String nome) {
		super(nome);
	}
	
	@Override
	public boolean isSome() {
		return !super.isSome();
	}
	
	public String imprimir() {
		return "Nome = " + this.nome + ", recebe = " + (this.salario != null ? new DecimalFormat("0.00").format(this.salario) : "null");
	}
	
	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}
}