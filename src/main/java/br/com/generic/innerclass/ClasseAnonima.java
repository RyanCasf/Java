package br.com.generic.innerclass;

public class ClasseAnonima {
	
	public void fazer() {
		Animal animal = new Animal() {
			
			@Override
			public void andar() {
				System.out.println("Andando");
			}
		};
		
		animal.andar();
		new Animal().andar();
	}
}

class Animal {
	
	public void andar() {
		System.out.println("Andar");
	}
}