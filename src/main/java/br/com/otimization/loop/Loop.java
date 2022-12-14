package br.com.otimization.loop;

public class Loop {
	
	public static void main(String[] args) {
		Loop loop = new Loop();
		String[] palavras = new String[3000];
		
		long inicio = System.nanoTime();
		loop.loopFor(palavras);
		System.out.println("For: " + (System.nanoTime() - inicio));
		
		inicio = System.nanoTime();
		loop.loopForSize(palavras);
		System.out.println("For com tamanho: " + (System.nanoTime() - inicio));
		
		inicio = System.nanoTime();
		loop.loopForEach(palavras);
		System.out.println("ForEach: " + (System.nanoTime() - inicio));
	}
	
	public void loopFor(final String[] palavras) {
		for (int i = 0; i < palavras.length; i++);
	}
	
	public void loopForSize(final String[] palavras) {
		final int tamanho = palavras.length;
		for (int i = 0; i < tamanho; i++);
	}
	
	public void loopForEach(final String[] palavras) {
		for (String palavra : palavras);
	}
}