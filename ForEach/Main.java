package ForEach;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {

	public static ArrayList<String> datas = new ArrayList<String>();
	
	public static void main(String[] args) {
		
		// Collection with ArrayList to read on a For Each
		int count = 0;
		
		do {
			count = Integer.parseInt(JOptionPane.showInputDialog("\tMENU\n\n0. Sair\n1. Cadastrar\n"
					+ "2. Exibir"));
			switch(count) {
			case 0:
				System.out.println("Saindo...");
				System.exit(0);
			case 1:
				adicionar();
				break;
			case 2:
				listar();
				break;
			default:
				System.out.println("Invalid option");
			}
		} while (count !=0 );
	}
	
	static void adicionar() {
		String msg = JOptionPane.showInputDialog("Enner with a word (random): ");
		datas.add(msg);
	}
	
	static void listar() {
		for(String param : datas) {
			System.out.println(param);
		}
	}
}