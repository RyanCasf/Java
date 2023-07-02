package br.com.stream.consumer;

import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
	
	private Consumidor() {
		throw new IllegalStateException("Classe utilitária");
	}
	
	public static <T> void forEach(List<T> list, Consumer<T> consumer) {
		list.forEach(consumer::accept);
	}
}