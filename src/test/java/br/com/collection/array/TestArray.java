package br.com.collection.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.junit.Assert;
import org.junit.Test;

public class TestArray 
{
	static Random random = new Random();
	
	@Test(expected = OutOfMemoryError.class)
	public void testInicializacaoEstouroMemoria()
	{
		Array a = new Array(Integer.MAX_VALUE);
		Assert.assertEquals(a, a);
	}
	
	@Test(expected = AssertionError.class)
	public void testInicializacaoNegativo()
	{
		Array a = new Array(-1);
		Array A = null;
		
		Assert.assertEquals(A, a);
	}
	
	@Test
	public void testAdicionar()
	{
		Array a = new Array(10);
	
		List<String> listaV = new ArrayList<String>();
		Integer value;
		
		for (int i=0; i<10; i++) 
		{
			value = random.nextInt(10);

			listaV.add(value.toString());
			System.out.println(i+" : "+value);
			a.adicionar(value.toString());
		}
		
		Assert.assertTrue(a.obter(0).equals(listaV.get(0)));
	}
	
	@Test
	public void testObter()
	{
		Array a = new Array(5);
		a.adicionar("A");
		a.adicionar("B");
		a.adicionar("E");
		
		Assert.assertTrue(a.obter(1).equals("B"));
	}
	
	@Test
	public void testObterInexistenteUP()
	{
		Array a = new Array(0);
		String value = a.obter(1);
		Assert.assertNull(value);
	}
	
	@Test
	public void testObterInexistenteDOWN()
	{
		Array a = new Array(0);
		String value = a.obter(-1);
		Assert.assertNull(value);
	}
}