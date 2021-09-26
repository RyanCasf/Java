package br.com.scanner;

import java.io.Serializable;
import java.util.Scanner;

public class IOU implements Serializable
{
	private Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) 
	{
		new IOU().Input();
	}
	
	public void Input()
	{
		System.out.println("Digite algo: ");
		String entrada = scanner.next();
		System.out.println("Digitado: "+entrada);
	}
			
	public Scanner getScanner() {
		return scanner;
	}

	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}
}