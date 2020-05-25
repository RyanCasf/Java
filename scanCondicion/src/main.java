import java.util.Scanner;
public class main {
    
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("AGE");
        
        System.out.println("Enter your age:");
        int age = Scan.nextInt();
        
            if (age < 0) {
                System.out.println("Enter invalid!");
            } else if (age < 18) {
                System.out.println("Under age");
            } else if (age < 65) {
                System.out.println("Adult");
            } else {
                System.out.println("Old");
            }
    }
}