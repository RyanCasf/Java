import javax.swing.JOptionPane;    
public class OpcaoTernaria {

    public static void main(String[] args) {

    	System.out.println("\nFormula da Opcao Ternaria!\n");
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
        n = n%3 == 1 ? 1 : 0;
        // ? SSim | : Sñ
        System.out.print(n - (n % 1));
    }
}