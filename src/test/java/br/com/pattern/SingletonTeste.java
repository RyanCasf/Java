package br.com.pattern;

import org.junit.Assert;
import org.junit.Test;

public class SingletonTeste {

	@Test
	public void unicoInstacia() {
		Singleton singleton = Singleton.getInstance("1");
		Singleton anotherSingleton = Singleton.getInstance("2");

		Assert.assertEquals("1", singleton.value);
		Assert.assertEquals("1", anotherSingleton.value);
	}
}