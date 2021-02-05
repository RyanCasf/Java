import javax.swing.JOptionPane;
public class Veiculo {

    public String modelo, cor, versao;
    public int ano;

    public void cadastrarVeiculo() {
        this.modelo = JOptionPane.showInputDialog("Digite o modelo do veículo: ");
        this.cor = JOptionPane.showInputDialog("Digite a cor do veículo: ");
        this.versao = JOptionPane.showInputDialog("Digite a versão do veículo: ");
        this.ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do carro: "));
    }

    public void exibirVeiculo() {
        JOptionPane.showMessageDialog(null, "Dados da Veículo: \n"
                + "\nmodelo: " + this.modelo
                + "\ncor: " + this.cor
                + "\nversao: " + this.versao
                + "\nano: " + this.ano);
    }
}