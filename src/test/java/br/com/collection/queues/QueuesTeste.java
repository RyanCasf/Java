package br.com.collection.queues;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.junit.Assert;
import org.junit.Test;

public class QueuesTeste {
	
	@Test
	public void queueOrdenacao() {
		List<Double> lista = Arrays.asList(2.0, 5.0, 1.0, 0.0, 0.4);
		List<Double> resultado = Queues.priorityRender(lista);
		
		Assert.assertEquals(Arrays.asList(0.0, 0.4, 1.0, 2.0, 5.0), resultado);
	}
	
	@Test
	public void queueOrderByRandom() {
		final int TAMANHO = 10;
		List<Double> resultado = Queues.priorityRender( fetchQueue(TAMANHO));
		
		for (int i=0; i<TAMANHO; i++) {
			for (int j=(i+1); j<TAMANHO; j++) {
				Assert.assertTrue(resultado.get(i).compareTo(resultado.get(j)) <= 0);
			}
		}
	}
	
	private static List<Double> fetchQueue(int tamanho) {
		Random random = new Random();
		List<Double> temp = new ArrayList<Double>();
		
		for (int i = 0; i < tamanho; i++) {
			temp.add(random.nextDouble());
		}
		
		return temp;
	}
}