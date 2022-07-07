package br.com.strategy;

public enum Cargo implements ComissaoFuncionario {
	
	ATENDENTE { @Override public double calculaComissao(double valor) { return valor * 0.1; }},
	GERENTE { @Override public double calculaComissao(double valor) { return (valor * 0.2) + 10; }}
}