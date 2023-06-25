package br.com.generic.type;

import java.util.List;

public class RentavelService<T> {
	
	private List<T> listaDisponiveis;
	
	public RentavelService(List<T> listaDisponiveis) {
		this.listaDisponiveis = listaDisponiveis;
	}
	
	public T buscarDisponivel() {
		if (listaDisponiveis.isEmpty())
			return null;
		
		return listaDisponiveis.remove(0);
	}
	
	public boolean retornar(T t) {
		if (t == null)
			return false;
		
		return listaDisponiveis.add(t);
	}
}