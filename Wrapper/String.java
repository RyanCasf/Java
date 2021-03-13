package Wrapper;
import javax.swing.JOptionPane;

public class String 
{
	public static void main( String[] args ) 
	{
		// A String tem a função de armazenar um conjunto de caractere (um texto)
		// |-> String a[] = String data.split("/") quebra a linha de acordo com algo
		
		// Wapper ajuda a Envolver coisas ( class and type primitive ) o trabalhando c/ Obj
		
		Integer i = Integer.valueOf(2);
		// int = Integer  &  char = Caracter (ASCII)
		
		JOptionPane.showMessageDialog(null, "Conhecendo JAVA\n\nValor de Teste: "+i, 
				"JAVA", JOptionPane.WARNING_MESSAGE);
		
		Double meuDouble = 10.20; // Boxing 
		float f = new Float(1.0f); // Unboxing ( toPrimity )
		
		// * Collections somente com Objetos, logo Autoboxing
		// * método equals nos “Pojos” - Compara Objetos como são
	// |-> O "==" pode funcionar pelo JIT (Flyweigth), pois org. as referências de obj iguais
		
/*
 * Fluxo de Conexões como orientado a objetos (ObjectInputStream);
 * Fluxos de Audio (AudioInputStream);
 * Tipos primitivos (DataInputStream);
 * Buffers (BufferedInputStream).
 */				
	}
}