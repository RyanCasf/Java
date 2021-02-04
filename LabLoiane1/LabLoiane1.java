import java.util.Scanner;
import javax.swing.JOptionPane;

class LabLoiane1 {
	public static void main (String[] args) {

		// Write hello
		System.out.println("\nHello World!\nlist of tasks\n");

		// Average
		try{
			Scanner input = new Scanner(System.in);
			System.out.println("Software of Average");
			System.out.println("Type 4 numbers: ");
			int a, b, c, d;
			a = input.nextInt();
			b = input.nextInt();
			c = input.nextInt();
			d = input.nextInt();
			System.out.println("Result: " +((a+b+c+d)/4));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Fill in correctly!\n\n" +"Erro: "+e);
			System.out.print("\n\tExiting...");
			System.exit(0);
		}

		// Convert m - c
		try{
			Scanner in = new Scanner(System.in);
			System.out.println("\nConvert");
			System.out.println("Type the meter: ");
			float meter = 0;
			meter = in.nextInt();
			System.out.println(meter * 1000+"cm - from - "+meter+"m");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Fill in correctly!\n\n" +"Erro: "+e);
			System.out.print("\n\tExiting...");
			System.exit(0);
		}

		// Circle datas
		try{
			System.out.println("\nCircle");
			final double PI = 3.1416;
			double radius = Double.parseDouble(JOptionPane.showInputDialog("Type radius of the circle: "));
			System.out.println("Circumference: " +(2* PI * radius) +"\nArea: " +(PI * (radius * radius)));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Fill in correctly!\n\n" +"Erro: "+e);
			System.out.print("\n\tExiting...");
			System.exit(0);
		}

		// Farenheit to Celsius
		try{
			System.out.print("Farenheit to Celsius");
			double farenheit = Double.parseDouble(JOptionPane.showInputDialog("Type graus in Farenheit: "));
			//System.out.println("Farenheit: "+farenheit+"ºF\nCelsius: "+(5 * (farenheit-32) / 9)+"ºC\nKelvin: "+(5 * (farenheit-32) / 9 + 272)+"K");			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Fill in correctly!\n\n" +"Erro: "+e);
			System.out.print("\n\tExiting...");
			System.exit(0);
		}

		// Simple condition Age
		try{
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

        } catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Fill in correctly!\n\n" +"Erro: "+e);
			System.out.print("\n\tExiting...");
			System.exit(0);
		}

		// tam. of file MB - vel. link on Mbps
		try{
			System.out.print("Time for download of the file");
			double fileArm = Double.parseDouble(JOptionPane.showInputDialog("Type file (MB): ")); // 1024 Kbps
			double linkVel = Double.parseDouble(JOptionPane.showInputDialog("Type Link (Mbps): ")); //MB por segundo 
			System.out.println(fileArm +" and " +linkVel);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Fill in correctly!\n\n" +"Erro: "+e);
			System.out.print("\n\tExiting...");
			System.exit(0);
		}
	}
}