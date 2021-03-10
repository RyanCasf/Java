package Random;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Random ale = new Random();
		int i = ale.nextInt(6)+1;
		// 0-5  with  +1 of the number random
		System.out.print(i);
		
	}
}