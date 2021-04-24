package Math;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		// Name is always a reference so the name is valided in anything Variable
		
		int a=10, b=8;
		JOptionPane.showMessageDialog(null, "Math: \n\t" +(Math.sqrt(a+b)));
		float c=-10;
		JOptionPane.showMessageDialog(null, "Math: \n\t" +(Math.abs(c)));
	}
}