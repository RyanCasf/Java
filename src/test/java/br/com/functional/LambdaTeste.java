package br.com.functional;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import br.com.functional.model.Funcionario;

public class LambdaTeste {
	private final Lambda lambda = new Lambda();
	
	private List<Funcionario> funcionarios = new ArrayList<Funcionario>() {{
		add(new Funcionario("Ryan", "Programador", 20.0));
		add(new Funcionario("Ryan", "Auxiliar Geral", 10.0));
	}};
	
	private List<String> lista = new ArrayList<String>() {{ 
		add("A"); add("B"); add("C"); add("D");
	}};
	
	@Test
	public void filtragem() {
		Assert.assertArrayEquals(new String[] {"A"}, lambda.filter(lista).toArray());
	}
	
	@Test
	public void filtragemMapeada() {
		Assert.assertArrayEquals(new String[] {"Ryan", "Ryan"}, lambda.filterComp(funcionarios).toArray());
	}
}