package br.com.math;

import java.util.Scanner;

public class Fibonacci {
	private static Scanner scanner = new Scanner(System.in);

	static long fibonacci(int n) {
		return (n < 2) ? n : fibonacci(n - 1) + fibonacci(n - 2);
	}

	public static void main(String[] args) {
		try {
			int tamanho = obterTamanho();

			for (int i = 0; i < tamanho; i++) {
				System.out.println("[" + i + "]: " + Fibonacci.fibonacci(i));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static int obterTamanho() throws Exception {
		System.out.println("Cálcula para sequência de Fibonacci!");

		System.out.println("Entre com o tamanho inteiro da posição: ");
		try {
			int tamanho = scanner.nextInt();

			if (tamanho <= 0) {
				throw new IllegalArgumentException("Valor inválido, deve ser maior que 0!");
			}
			return tamanho;
		} catch (Exception e) {
			throw new Exception("Algo deu errao!");
		}
	}
}