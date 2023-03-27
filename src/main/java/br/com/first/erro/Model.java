package br.com.first.erro;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Model {

	private Model() {
		throw new IllegalStateException("Classe utilitária!");
	}

	public static void arquivoChecked() throws CheckedException {
		throw new CheckedException();
	}

	public static void arquivoUnchecked() throws UncheckedException {
		throw new UncheckedException();
	}
	
	public static void arquivoCheckedComTryCatch() throws Exception {
		try {
			arquivoChecked();
		} 
		catch (CheckedException e) {
			e = (CheckedException) new Exception();
			throw e;
		}
	}
	
	/*
	 * implements Closeable to Resource try
	 */
	public static void lerArquivo() throws IOException {
		try (Reader reader1 = new BufferedReader(new FileReader("text.txt"));
				Reader reader2 = new BufferedReader(new FileReader("text.txt"))) {
			throw new IOException();
		} 
		catch (IOException e) {
			throw e;
		}
	}
}