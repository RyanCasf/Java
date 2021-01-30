import java.util.Scanner;
public class main{

    public static void main(String[] args) {
	
	Scanner inner = new Scanner(System.in);
	
	System.out.println("\nEnter with your name:");
	String name = inner.nextLine();
	
	System.out.println("\nType your last name:");
	String lastName = inner.nextLine();

	System.out.print("\n Full name: " +name +" " +lastName +"\n");
    }
}