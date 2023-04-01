package br.com.entradasaida.arquivo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
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
		Configuracao.imprimir("Arquivo de entrada e saída criado: " + isCriado);

		if (isCriado) {
			try (FileWriter fileWriter = new FileWriter(file);
				 BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

				bufferedWriter.write("Teste de escrita...");
				bufferedWriter.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}

			try (FileReader fileReader = new FileReader(file);
				 BufferedReader bufferedReader = new BufferedReader(fileReader)) {

				String label;
				while ((label = bufferedReader.readLine()) != null) {
					Configuracao.imprimir(label);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

			limparArquivo(CAMINHO);
		}
	}

	private static void limparArquivo(final String CAMINHO) {
		try {
			File temp = new File(CAMINHO);
			if (temp.exists()) {
				final boolean isDeletado = temp.delete();
				Configuracao.imprimir("Arquivo de entrada e saída excluído: " + isDeletado);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}