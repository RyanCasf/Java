package content.br.com.lista;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Iterators {

	public static void main(String[] args) {
		List<String> lista = Arrays.asList("A", "B", "C", "D", "E");
		
		Iterator<String> iterador = lista.iterator();
		while (iterador.hasNext()) {
			System.out.println("Letra: " + iterador.next());
		}
	}
}