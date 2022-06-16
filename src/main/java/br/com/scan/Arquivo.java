package br.com.scan;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Arquivo {

	public static void lendoArquivo(String caminho) {
		Scanner sc = null;
		try {
			File file = new File(caminho);

			sc = new Scanner(file);
			while (sc.hasNextLong()) {
				long aLong = sc.nextLong();
			}
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			if (sc != null) {
				sc.close();
			}
		}
	}
}