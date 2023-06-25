package br.com.generic.entity;

public class Metodo {
	
	public <E> boolean isString(E e) {
		return e instanceof String;
	}
}