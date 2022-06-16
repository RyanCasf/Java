package br.com.swing;

import javax.swing.JOptionPane;

public class EntradasGraficos {
	
	public void gerandoJO() {
		JOptionPane.showMessageDialog(null, "Apresentação do SWING", "java.swing", SwingModel.ALERT_ERROR, null);
		
		int resultConfirm = JOptionPane.showConfirmDialog(null, "Você confirma isso: ", "Selecione a opção desejada", 1);
		System.out.println(resultConfirm);
		
		Object resultInput = JOptionPane.showInputDialog(null, "Dígite algo: ");
		System.out.println(resultInput != null ? resultInput.toString() : "Nulo");
	}
}