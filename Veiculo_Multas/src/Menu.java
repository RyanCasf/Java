import javax.swing.JOptionPane;
public class Menu {

    public int Op;
    public boolean passagem1 = false, passagem2 = false, passagem3 = false;

    Proprietario Pr = new Proprietario();
    Multa Mu = new Multa();
    Veiculo Ve = new Veiculo();

    public void control() {
        try {
            do {
                Op = Integer.parseInt(JOptionPane.showInputDialog("Digite uma das opções abaixo:"
                        + "\n=============================="
                        + "\n1. Cadastrar Multa"
                        + "\n2. Exibir Multa"
                        + "\n3. Cadastrar Proprietário"
                        + "\n4. Exibir Proprietário"
                        + "\n5. Cadastrar Veículo"
                        + "\n5. Exibir Veículo"
                        + "\n0. Sair"
                        + "\n=============================="));

                switch (Op) {
                    case 0:
                        JOptionPane.showMessageDialog(null, "Saindo...");
                        break;

                    case 1:
                        Mu.cadastrarMulta();
                        this.passagem1 = true;
                        break;

                    case 2:
                        if (this.passagem1 == true) {
                            Mu.exibirMulta();
                        } else {
                            JOptionPane.showMessageDialog(null, "Cadastre a Multa!");
                        }
                        break;

                    case 3:
                        Pr.cadastrarProprietario();
                        this.passagem2 = true;
                        break;

                    case 4:
                        if (this.passagem2 == true) {
                            Pr.exibirProprietario();
                        } else {
                            JOptionPane.showMessageDialog(null, "Cadastre o proprietário!");
                        }
                        break;

                    case 5:
                        Ve.cadastrarVeiculo();
                        this.passagem3 = true;
                        break;

                    case 6:
                        if (this.passagem3 == true) {
                            Ve.exibirVeiculo();
                        } else {
                            JOptionPane.showMessageDialog(null, "Cadastre o veículo!");
                        }
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Opção Inválida!");
                }
            } while (Op != 0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Preencha corretamente!\n\nErro: " + e);
            this.control();
        }
    }
}