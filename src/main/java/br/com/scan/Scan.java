package br.com.scan;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Scan 
{
	public static void main(String[] args)  
	{
		Scanner sc = null;
		try {
			File file = new File("C:\\Users\\ryanc\\filename.txt");
			
			sc = new Scanner(file);
			while (sc.hasNextLong()) {
				long aLong = sc.nextLong();
				System.out.println(aLong);
			}
		} 
		catch (IOException e) { System.out.println(e.getMessage()); }
		finally { sc.close(); }
	}
}