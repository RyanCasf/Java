package br.com.generic.type;

import java.util.ArrayList;
import java.util.List;

public class CarroRentavelService {
	
	private List<Carro> carros = new ArrayList<Carro>(List.of(
			new Carro("BMW"),
			new Carro("Fusca")
	));
	
	public Carro buscarCarroDisponivel() {
		if (carros.isEmpty())
			return null;
		
		return carros.remove(0);
	}
	
	public boolean retornarCarro(Carro carro) {
		if (carro == null)
			return false;
		
		return carros.add(carro);
	}
}