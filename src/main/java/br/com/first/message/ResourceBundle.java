package br.com.first.message;

import java.util.Locale;

public class ResourceBundle {
	
	private static final java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("messagem", new Locale("pt", "BR"));
	
	public String getHello() {
		return bundle.getString("hello");
	}
	
	public String getGoodMornig() {
		return bundle.getString("goodMorning");
	}
}