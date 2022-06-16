package br.com.pattern;

public class Singleton {
	private static Singleton singleton;
	public String value;

	private Singleton(String value) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		this.value = value;
	}

	public static Singleton getInstance(String value) {
		if (singleton == null) {
			singleton = new Singleton(value);
		}
		return singleton;
	}

	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance("1");
		Singleton anotherSingleton = Singleton.getInstance("2");

		System.out.println(singleton.value);
		System.out.println(anotherSingleton.value);
	}
}