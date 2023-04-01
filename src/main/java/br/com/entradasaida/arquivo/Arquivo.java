package br.com.entradasaida.arquivo;

import java.io.File;
import java.io.IOException;

public class Arquivo {
	
	private Arquivo() {
		throw new IllegalStateException("Classe utilitária!");
	}
	
	public static void criar(final String CAMINHO) throws IOException {
		if (CAMINHO == null) {
			throw new IllegalArgumentException("caminho is null");
		}
		
		if (CAMINHO.trim().isEmpty()) {
			throw new IllegalArgumentException("caminho is empty");
		}
		
		File file = new File(CAMINHO);
		boolean isCriado = file.createNewFile();
		
		if (isCriado) {
			limparArquivo(CAMINHO);
		}
	}
	
	private static void limparArquivo(final String CAMINHO) {
		try {
			File temp = new File(CAMINHO);
			if (temp.exists()) {
				temp.delete();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}