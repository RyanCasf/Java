package br.com.swing;

import javax.swing.JOptionPane;

public class EntradasGraficos {
	
	public void gerandoJO() {
		JOptionPane.showMessageDialog(null, "Apresenta??o do SWING", "java.swing", SwingModel.ALERT_ERROR, null);
		
		int resultConfirm = JOptionPane.showConfirmDialog(null, "Voc? confirma isso: ", "Selecione a op??o desejada", 1);
		System.out.println(resultConfirm);
		
		Object resultInput = JOptionPane.showInputDialog(null, "D?gite algo: ");
		System.out.println(resultInput != null ? resultInput.toString() : "Nulo");
	}
}