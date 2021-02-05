import javax.swing.JOptionPane;
public class Proprietario {

    public String nome, CPF, telefone;

    public void cadastrarProprietario() {
        this.nome = JOptionPane.showInputDialog("Digite o seu nome: ");
        this.CPF = JOptionPane.showInputDialog("Digite o seu CPF: ");
        this.telefone = JOptionPane.showInputDialog("Digite o seu número de telefone: ");
    }

    public void exibirProprietario() {
        JOptionPane.showMessageDialog(null, "Dados do Proprietário: \n"
                + "\nNome: " + this.nome
                + "\nCPF: " + this.CPF
                + "\nTelefone: " + this.telefone);
    }
}