package br.com.functional;

import java.util.function.Consumer;

import br.com.functional.Consumo.Cliente;

public class Consumidor {
	static Consumer<Cliente> msgValido = (c) -> 
		System.out.println("Olá " + c.getNome() + ", seu número de identificação é.: " + c.getChave());
}