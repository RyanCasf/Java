import java.util.Scanner;
class Array
{
	private String vogais[] = {"a", "e", "i", "o", "u"};

	public static void main(String[] args) 
	{
		Array array = new Array();
		array.alfabeto(); 
	}

	private void alfabeto()
	{
		System.out.println("A L F A B E T O !");

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite uma palavra: ");
		String entrada = scan.next();

		System.out.println(verificarLetras(entrada));
		// System.out.println("Vogais: "+vogais[0]); - Render class
	}

	private StringBuilder verificarLetras(String entrada)
	{
		StringBuilder sb = new StringBuilder();

		for (byte i=0; i<entrada.length() - 1; i++) 
		{
      		if (!Character.isLetter(entrada.charAt(i))) 
      		{
        		sb.append("Posicao : "+(++i)+" nao e uma letra.");
        		i--;
      		}
      		else
      		{
  				sb.append(entrada.charAt(i));
      		}
    	}

		return sb;
	}
}