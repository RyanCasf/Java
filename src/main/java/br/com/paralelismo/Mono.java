package br.com.paralelismo;

public class Mono {
	public static void main(String[] args) {
		System.out.println("-------------------Execução Iniciada: 0");
		long inicio = System.nanoTime();
		new Mono().start();
		System.out.println("\n-------------------Execução Competa : " + (System.nanoTime() - inicio));
	}

	public void start() {
		Evento event1 = new Evento();
		event1.print();

		Evento event2 = new Evento();
		event2.print();

		Evento event3 = new Evento();
		event3.print();
	}
}

class Evento {
	public void print() {
		for (int i = 0; i < 10; i++) {
			System.err.print(i);
		}
	}
}