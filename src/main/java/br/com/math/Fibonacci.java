package br.com.math;

import java.util.Scanner;

public class Fibonacci {

	public static long fibonacci(int n) {
		return (n < 2) ? n : fibonacci(n - 1) + fibonacci(n - 2);
	}

	public static int obterTamanho() {
		Scanner scanner = new Scanner(System.in);
				
		System.out.println("Entre com o tamanho inteiro da posição: ");
		try {
			int tamanho = scanner.nextInt();

			if (tamanho <= 0) {
				throw new IllegalArgumentException("Valor inválido, deve ser maior que 0!");
			}
			return tamanho;
		} 
		catch (Exception e) {
			e.printStackTrace();
			System.err.println("Algo deu errado ao entrar com o valor!");
			
			return 0;
		}
	}
}