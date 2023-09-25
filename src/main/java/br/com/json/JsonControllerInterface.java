package br.com.json;

interface JsonControllerInterface<E> {
	
	String write(E entity);
}