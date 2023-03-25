package br.com.first.scan;

import java.util.Scanner;

public class KeyScan {
	
	private final Scanner scanner = new Scanner(System.in);
	
	public void entradaPalavra() {
		scanner.next();
	}
	
	public void entradaLinha() {
		scanner.nextLine();
	}
}