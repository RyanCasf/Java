package br.com.math;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciTeste {

	@Test
	public void fibonacciZero() {
		Assert.assertEquals(0, Fibonacci.fibonacci(0));
	}
	
	@Test
	public void fibonacciNegativo() {
		Random random = new Random();
		int param = Math.abs(random.nextInt()) * (-1);
		
		Assert.assertEquals(param, Fibonacci.fibonacci(param));
	}
}