
public class SwapNumbers {

	public static void main(String[] args) {
		
		int a = 2; 
		int b = 4;
		
		swap(a, b);
		
	}
	
	public static void swap(int a, int b) {
		
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("a is now " + a);
		System.out.println("b is now " + b);
	}

}
