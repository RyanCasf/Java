package br.com.swing;

import javax.swing.JOptionPane;

public class EntradasGraficos {
	
	private static final int ALERT_ERROR = 0;
	private static final int ALERT_EXCLA = 1;
	private static final int ALERT_WARNING = 2;
	private static final int ALERT_INTERRO = 3;
	
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Apresentação do SWING", "java.swing", ALERT_ERROR, null);
		
		int resultConfirm = JOptionPane.showConfirmDialog(null, "Você confirma isso: ", "Selecione a opção desejada", 1);
		System.out.println(resultConfirm);
		
		Object resultInput = JOptionPane.showInputDialog(null, "Dígite algo: ");
		System.out.println(resultInput != null ? resultInput.toString() : "Nulo");
	}
}