package br.com.functional;

import java.util.function.Consumer;

import br.com.functional.Consumo.Cliente;

public class Consumidor {
	static Consumer<Cliente> msgValido = (c) -> 
		System.out.println("Ol? " + c.getNome() + ", seu n?mero de identifica??o ?.: " + c.getChave());
}