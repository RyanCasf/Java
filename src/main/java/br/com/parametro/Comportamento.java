package br.com.parametro;

import java.util.ArrayList;
import java.util.List;

public class Comportamento {
	
	private List<Carro> carros = new ArrayList<>(List.of(new Carro("red", 1998), new Carro("green", 2015), new Carro("blue", 2023)));
	
	public void filtrar() {
		filter(carro -> carro.getCor().equalsIgnoreCase("green"));
	}
	
	private void filter(CarroPredicate carroInterface) {
		for (int i=0; i<carros.size(); i++) {
			if (!carroInterface.filter(carros.get(i))) {
				carros.remove(i);
				i--;
			}
		}
	}
	
	public List<Carro> getCarros() {
		return carros;
	}
}