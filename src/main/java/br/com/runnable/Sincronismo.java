package br.com.runnable;

public class Sincronismo 
{
	public static void main(String[] args) {
		new Thread(() -> System.out.println("Start...")).start();
	}
}