package Constructor;

public class Main {
	
	public static void main(String a[]) {
		
		Help help1 = new Help("Ryan");
		Help help2 = new Help("Felipe");
		
		System.out.println(help1);
		
		Byte A = -127;
		Byte b = 127;
		
		System.out.println(A==b);
		
		// C/ Precisão Arbitrária q o Double/Int q abre p/ Aproximação 5.69999999 = 5.79
		// BigDecimal a = 458.5;
		
		// Recebem a Sí msm e a String, exceto "Char" q só para sí (mas é um Int)
		Boolean b4 = new Boolean("qualquer coisa");
		System.out.println(b4);
	}
}

/*  @Override
	public String toString() {
		return "Help [name: " + name + "]";
	}
*/