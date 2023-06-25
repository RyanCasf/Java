package br.com.generic.wildcard;

import java.util.List;

abstract class Animal {
	public abstract void consultar();
}

class Cachorro extends Animal {
	
	@Override
	public void consultar() {
		
	}
}

class Gato extends Animal {
	
	@Override
	public void consultar() {
		
	}
}

public class WildCard {
	
	public void printConsultar(Animal[] animais) {
		if (animais == null || animais.length == 0)
			return;
		
		for (Animal animal : animais) {
			animal.consultar();
		}
	}
	
	public void printConsultar(List<? extends Animal> animais) {
		if (animais == null || animais.isEmpty())
			return;
		
		for (Animal animal : animais) {
			animal.consultar();
		}
	}
}