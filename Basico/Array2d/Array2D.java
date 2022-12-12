package Basico.Array2d;

public class Array2D {
	public static void main(String[] args) {
		String dale[][] = {
			{ "Carro", "Fiat", "Idea", "Idea" }, 
			{ "Moto", "Fan", "CG-150", "Idea" }
		};

		int index = dale.length;
		System.out.println(index);

		for (int row = 0; row < dale.length; row++) {
			System.out.println();
			for (int column = 0; column < dale[row].length; column++) {
				System.out.print(dale[row][column] + " ");
			}
		}
	}
}