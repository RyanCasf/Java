package br.com.ryan.mvc;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Control 
{
	public void controlador()
	{
		Scanner scanner = new Scanner(System.in);
		Integer opcao, chave = 0;
		
		Map<Integer, Model> lista = new HashMap<Integer, Model>();
		
		do 
		{
			String valor = null;
			
			System.out.println("MAP\n\nDigite o número respectivo ao opção:\n"
				+"1. Cadastrar\n2. Buscar\n0. Sair");
			opcao = Integer.parseInt(scanner.next());
			
			switch (opcao.intValue()) 
			{
				case 0:
					System.out.println("Saindo...");
					System.exit(0);
					break;
					
				case 1:
					System.out.println("CADASTRAR\nValor:");
					valor = scanner.next();
					lista.put(++chave, new Model(valor));
					break;
					
				case 2:
					System.out.println("BUSCAR\nValor:");
					valor = scanner.next();
					System.out.println(lista.get(Integer.parseInt(valor.toString())).toString());
					break;
					
				case 3:
					System.out.println("EXCLUIR\nValor:");
					valor = scanner.next();
					lista.remove(Integer.parseInt(valor.toString()));
					break;
	
				default:
					System.out.println("Opção inváilida!");
					break;
			}
		}
		while (opcao != null && opcao.intValue() != 0);
		
	}
	
	public static void main(String[] args) 
	{
		try 
		{
			new Control().controlador();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			System.out.println("ERROR: "+e.getMessage());
		}
	}
}