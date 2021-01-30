import java.util.Scanner;

public class ICanCountForever {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("What number should I count to?");
		
		int n = scan.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println(i);
		}
		
	}

}
