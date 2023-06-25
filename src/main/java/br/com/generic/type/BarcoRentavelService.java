package br.com.generic.type;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentavelService {
	
	private List<Object> barcos = new ArrayList<Object>(List.of(
			new Object("Lancha"),
			new Object("Canoa")
	));
	
	public Object buscarBarcoDisponivel() {
		if (barcos.isEmpty())
			return null;
		
		return barcos.remove(0);
	}
	
	public boolean retornarBarco(Object barco) {
		if (barco == null)
			return false;
		
		return barcos.add(barco);
	}
}