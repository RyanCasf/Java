import java.util.Scanner;
public class scannerInput {

    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What's your full name: ");
		String fullName = scan.nextLine(); //Get full line wrote
		System.out.println("Your name: " +fullName);
		
		System.out.println("What's your full Name, Age and Height: ");
		String name = scan.next();
		int age = scan.nextInt();
		float height = scan.nextFloat();
		System.out.println("DATA\n\nName: "+name +"\nAge: "+age +"\nHeight: "+height);
    }  
}