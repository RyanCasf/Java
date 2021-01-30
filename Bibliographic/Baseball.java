import java.util.Random;
import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int possibilities = 10;
		
		System.out.println("===================================");
		System.out.println("||                               ||");
		System.out.println("||                               ||");
		System.out.println("||           BASEBALL            ||");
		System.out.println("||                               ||");
		System.out.println("||                               ||");
		System.out.println("===================================");

		System.out.println("\"Here comes the pitch\"");
		System.out.println("----------------------");
		System.out.println("(Type 's' and ENTER to swing)");
		String input = scan.next();
		
		if(input.equalsIgnoreCase("s")) {
			int n = rand.nextInt(possibilities + 1);
			
			if(n <= 4) {
				System.out.println("Single");
				System.out.println("<>");
			} else if(n > 4 && n <= 7) {
				System.out.println("Double");
				System.out.println("<> <>");
			} else if(n > 7 && n <= 9) {
				System.out.println("Triple!");
				System.out.println("<> <> <>");
			} else if(n == 10) {
				System.out.println("HOMERUN!!!");
				System.out.println("`~!****!~`");
			}
		}
		
		while(!input.equalsIgnoreCase("s")) {
			System.out.println("Type 's' then ENTER to swing");
			input = scan.next();
			
			if(input.equalsIgnoreCase("s")) {
				int n = rand.nextInt(possibilities + 1);
				
				if(n <= 4) {
					System.out.println("Single");
					System.out.println("<>");
				} else if(n > 4 && n <= 7) {
					System.out.println("Double");
					System.out.println("<> <>");
				} else if(n > 7 && n <= 9) {
					System.out.println("Triple!");
					System.out.println("<> <> <>");
				} else if(n == 10) {
					System.out.println("HOMERUN!!!");
					System.out.println("`~!****!~`");
				}
			}
		}

		
	}

}
