package content.br.com.lista;

import java.util.Enumeration;
import java.util.Hashtable;

public class Hash {
	
	public static void main(String[] args) {
		Hashtable<String, String> lista = new Hashtable<String, String>();
		lista.put("Ryan", "Castro Ferreira");
		
		String resultado = lista.get("Ryan");
		System.out.println("Sr(a).: " + resultado);
		
		Enumeration<String> chaves = lista.keys();
		Enumeration<String> valores = lista.elements();
		
		while (chaves.hasMoreElements()) {
			System.out.println("Sr(a).: " + chaves.nextElement() + ", " + valores.nextElement());
		}
	}
}