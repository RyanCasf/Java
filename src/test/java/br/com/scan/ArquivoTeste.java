package br.com.scan;

import org.junit.Test;

public class ArquivoTeste {
	private static final String URI = "C:\\Users\\ryanc\\filename.txt";
	
	@Test
	public void lerArquivo() {
		Arquivo.lendoArquivo(URI);
	}
}