package br.com.entradasaida.arquivo;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import util.conf.Configuracao;

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
			try (FileWriter fileWriter = new FileWriter(file)) {
				fileWriter.write("Teste de escrita...");
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			
			try (FileReader fileReader = new FileReader(file)) {
				int i;
				while ((i=fileReader.read()) != -1) {
					Configuracao.imprimir((char) i);
				}
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			
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