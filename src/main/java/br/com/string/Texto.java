package br.com.string;

import javax.swing.JOptionPane;
import br.com.swing.SwingModel;

public class Texto {

	public static void main(String[] args) {
		textToASCI();
	}

	private static void textToASCI() {
		String valor = JOptionPane.showInputDialog(null, "Dígite um valor: ", "STRING", SwingModel.ALERT_ERROR);
		
		if (valor != null && !valor.trim().equals("")) {
			for (char letra : valor.toCharArray()) {
				System.out.println(letra + " : " + ((int) letra));
			}
		}
		else {
			System.out.println("Valor nulo!");
		}
	}
}