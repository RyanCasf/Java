package util.conf;

public class Configuracao {
	
	private Configuracao() {
		throw new IllegalStateException("Classe Utilitária");
	}
	
	private static final boolean PRINT = true;
	
	public static void imprimir(final char i) {
		if (PRINT) System.out.print(i);
	}
	
	public static void imprimir(final String label) {
		if (PRINT) System.out.println(label);
	}
}