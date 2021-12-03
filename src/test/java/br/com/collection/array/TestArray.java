package br.com.collection.array;

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
		Long value = random.nextLong();
		
		Array a = new Array(10);
		a.adicionar(value.toString());
		
		Assert.assertTrue(a.obter(0).equals(value.toString()));
	}
}