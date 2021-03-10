import java.util.Scanner;
public class main{

    public static void main(String[] args) {
	
	Scanner inner = new Scanner(System.in);
	
	System.out.println("Enter a number: ");
	//int index = Integer.parseInt(inner.nextLine());
	int index = inner.nextInt();

	// inner.nextLine();

	System.out.println("\nEnter your name:");
	String name = inner.nextLine();
	
	System.out.println("\nEnter your last name:");
	String lastName = inner.next();

	System.out.print("\n Full name: " +name +" " +lastName +"\n");
    }+
}