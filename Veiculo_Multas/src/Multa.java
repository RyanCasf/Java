import javax.swing.JOptionPane;
public class Multa {

    public float valor;
    public String local, data, gravidade;
    public int pontos;

    public void cadastrarMulta() {
        this.local = JOptionPane.showInputDialog("Digite o local da infração: ");
        this.data = JOptionPane.showInputDialog("Digite a data da infração: ");
        this.gravidade = JOptionPane.showInputDialog("Digite a gravidade da infração: ");
        this.pontos = Integer.parseInt(JOptionPane.showInputDialog("Entre com a quantidade de pontos: "));
        this.valor = Float.parseFloat(JOptionPane.showInputDialog("Entre com o valor da multa: "));
    }

    public void exibirMulta() {
        JOptionPane.showMessageDialog(null, "Dados da Multa: \n"
                + "\nlocal: " + this.local
                + "\ndata: " + this.data
                + "\ngravidade: " + this.gravidade
                + "\npontos: " + this.pontos
                + "\nvalor: " + this.valor);
    }
}