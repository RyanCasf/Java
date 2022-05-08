package br.com.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.junit.Assert;
import org.junit.Test;

public class TestArray {
	private final static Random random = new Random();

	@Test(expected = OutOfMemoryError.class)
	public void testInicializacaoEstouroMemoria() {
		Array a = new Array(Integer.MAX_VALUE);
		Assert.assertEquals(a, a);
	}

	@Test(expected = AssertionError.class)
	public void testInicializacaoNegativo() {
		Array a = new Array(-1);
		Assert.assertNull(a);
	}

	@Test(expected = Exception.class)
	public void testAdicionar() throws Exception {
		Array a = new Array(10);

		List<String> listaV = new ArrayList<>();
		int value;

		for (int i = 0; i < 12; i++) {
			value = random.nextInt(10);
			listaV.add(Integer.toString(value));
			a.adicionar(Integer.toString(value));
		}

		boolean iguais = true;
		for (int i = 0; i < a.tamanho(); i++) {
			if (!a.obter(i).equals(listaV.get(i))) {
				iguais = false;
			}
		}

		Assert.assertTrue(iguais);
	}

	@Test
	public void testObter() throws Exception {
		Array a = new Array(5);
		a.adicionar("A");
		a.adicionar("B");
		a.adicionar("E");

		Assert.assertEquals(a.obter(1), "B");
	}

	@Test
	public void testObterInexistenteUP() {
		Array a = new Array(0);
		String value = a.obter(1);
		Assert.assertNull(value);
	}

	@Test
	public void testObterInexistenteDOWN() {
		Array a = new Array(0);
		String value = a.obter(-1);
		Assert.assertNull(value);
	}

	@Test
	public void testAdicionarIndex() throws Exception {
		Array a = new Array(10);

		List<String> listaV = new ArrayList<>();
		int value;

		for (int i = 0; i < 10; i++) {
			value = random.nextInt(10);
			listaV.add(Integer.toString(value));
			a.adicionar(i, Integer.toString(value));
		}

		boolean iguais = true;
		for (int i = 0; i < listaV.size(); i++) {
			if (!a.obter(i).equals(listaV.get(i))) {
				iguais = false;
			}
		}
		Assert.assertTrue(iguais);
	}

	@Test(expected = Exception.class)
	public void testAdicionarIndexInexistente() throws Exception {
		Array a = new Array(10);
		a.adicionar(11, "Algo");
	}
}