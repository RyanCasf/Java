package br.com.stream.primitivos;

import java.util.List;
import java.util.stream.IntStream;

public class Inteiro {
	
	public static List<Integer> range(int inicio, int fim) {
		return IntStream.range(inicio, fim)
				.boxed()
				.toList();
	}
}