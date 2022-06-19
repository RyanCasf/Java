package content.br.com.regex;

import java.util.Random;

public class FormatInt {
	private static final int SIZE = 3;

	public static void main(String[] args) {
		String[] strings = new String[SIZE];
		int[] inteiros = new int[SIZE];

		Random random = new Random();
		for (int i = 0; i < SIZE; i++) {
			strings[i] = Integer.toString(random.nextInt(100));
			inteiros[i] = random.nextInt(100);
		}

		for (int i = 0; i < SIZE; i++) {
			System.out.println(strings[i] + espaco(strings[i].length()) + (String.format("%03d", inteiros[i])));
		}
	}

	private static String espaco(int tamanho) {
		return String.format("%-" + (15 - tamanho) + "s", "");
	}
}