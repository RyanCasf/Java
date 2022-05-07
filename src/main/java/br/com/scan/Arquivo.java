package br.com.scan;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Arquivo {
	private static final String URI = "C:\\Users\\ryanc\\filename.txt";

	public static void main(String[] args) {
		try {
			Scanner sc;
			File file = new File(URI);

			sc = new Scanner(file);
			while (sc.hasNextLong()) {
				long aLong = sc.nextLong();
				System.out.println(aLong);
			}
			sc.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}