package br.com.paralelismo;

import java.math.BigDecimal;
import javax.swing.JOptionPane;

public class Bhaskara {
	private BigDecimal a, b, c;
	private BigDecimal delta, x1, x2;

	public static void main(String[] args) {
		Bhaskara b = new Bhaskara();
		b.obterEntradas();
		b.calcularRaizes();
		b.imprimirRaizes();
	}

	public void obterEntradas() {
		try {
			a = new BigDecimal("0.0");
			b = c = a;

			a = new BigDecimal(JOptionPane.showInputDialog("Dígite o valor de A: "));
			b = new BigDecimal(JOptionPane.showInputDialog("Dígite o valor de B: "));
			c = new BigDecimal(JOptionPane.showInputDialog("Dígite o valor de C: "));
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "ERRO.: Entrada incorreta!");
			obterEntradas();
		}
	}

	public void calcularRaizes() {
		delta = (b.pow(2)).subtract(new BigDecimal("4.0").multiply(a).multiply(c));

		BigDecimal raizQ;
		try {
			raizQ = BigDecimal.valueOf(Math.sqrt(delta.doubleValue()));
		} catch (NumberFormatException e) {
			System.out.println("RAIZ INCAPAZ!!");
			raizQ = new BigDecimal("0.0");
		}

		x1 = b.multiply(new BigDecimal("-1.0").subtract(raizQ)).divide(BigDecimal.valueOf(2).multiply(a));
		x2 = b.multiply(new BigDecimal("-1.0").add(raizQ)).divide(BigDecimal.valueOf(2).multiply(a));
	}

	public void imprimirRaizes() {
		JOptionPane.showMessageDialog(null, "RESULTADO...:\n" + "A.: " + a + " | B.:" + b + " | C.: " + c
				+ "\n\nDELTA: " + delta + "\nX'.: " + x1 + "\t X''.: " + x2);
	}

	public Bhaskara() {
		JOptionPane.showMessageDialog(null, "B H A S K A R A\n");
	}
}