package Switch;

public class Main {

	public static void main(String[] args) {
		
		char a = 'a';
		long b = 123L;
		float c = 132.213F;
		int testD = 132;
		
		c = (int) testD;
		b = (int) c;
		
		System.out.println(b+c);
		
		
		// byte, short, char, int, String and Enum
		switch(a) {
		case 'a':
			System.out.println(a);
			break;
		default:
			System.out.println("Bye!");
		}
	}
}