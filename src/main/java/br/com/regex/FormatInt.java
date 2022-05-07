package br.com.regex;

import java.util.Random;

public class FormatInt {
	private static Random random = new Random();
	private static final int SIZE = 3;

	public static void main(String[] args) {
		String[] strings = new String[SIZE];
		int[] inteiros = new int[SIZE];

		System.out.println("================================");

		for (int i = 0; i < SIZE; i++) {
			strings[i] = Integer.toString(random.nextInt(100));
			inteiros[i] = random.nextInt(100);
		}

		for (int i = 0; i < SIZE; i++) {
			System.out.println(strings[i] + (String.format("%-" + (15 - strings[i].length()) + "s", ""))
					+ (String.format("%03d", inteiros[i])));
		}

		System.out.println("================================");
	}
}