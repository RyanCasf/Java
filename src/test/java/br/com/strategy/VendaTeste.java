package br.com.strategy;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

public class VendaTeste {
	private final static Venda venda = new Venda();
	
	@Test
	public void venderAtendente() {
		venda.novo();
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Atendente");
		funcionario.setCargo(Cargo.ATENDENTE);
		
		venda.vender(funcionario, BigDecimal.valueOf(100f));
		
		Assert.assertEquals(funcionario, venda.getFuncionario());
		Assert.assertEquals(BigDecimal.valueOf(10.0), venda.getValor());
	}
	
	@Test
	public void venderGerente() {
		venda.novo();
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Gerente");
		funcionario.setCargo(Cargo.GERENTE);
		
		venda.vender(funcionario, BigDecimal.valueOf(100f));
		
		Assert.assertEquals(funcionario, venda.getFuncionario());
		Assert.assertEquals(BigDecimal.valueOf(30.0), venda.getValor());
	}
	
	@Test
	public void venderNulo() {
		venda.novo();
		
		venda.vender(null, null);
		
		Assert.assertEquals(null, venda.getFuncionario());
		Assert.assertEquals(null, venda.getValor());
	}
	
	@Test
	public void venderSemCargo() {
		venda.novo();
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Sem Cargo");
		
		venda.vender(funcionario, BigDecimal.valueOf(100f));
		
		Assert.assertEquals(null, venda.getFuncionario());
		Assert.assertEquals(null, venda.getValor());
	}
	
	@Test
	public void venderSemValor() {
		venda.novo();
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Sem Cargo");
		funcionario.setCargo(Cargo.ATENDENTE);
		
		venda.vender(funcionario, null);
		
		Assert.assertEquals(null, venda.getFuncionario());
		Assert.assertEquals(null, venda.getValor());
	}
}