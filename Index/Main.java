package Index;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		int row = Integer.parseInt(JOptionPane.showInputDialog("Enter with number(s) of the row(s): "));
		int column = Integer.parseInt(JOptionPane.showInputDialog("Enter with number(s) of the column(s): "));

		for(int index=1; index<=row; index++) {
			System.out.println();
			for(int j=1; j<=column; j++) {
				System.out.print(index+"@"+j);
			}
		}
		
	}
}