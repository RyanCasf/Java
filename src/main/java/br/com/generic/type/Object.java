package br.com.generic.type;

public class Object {
	
	private String modelo;
	
	public Object(String modelo) {
		this.modelo = modelo;
	}
	
	@Override
	public String toString() {
		return modelo;
	}
}