import javax.swing.JOptionPane;

public class Menu {

    Consulta con = new Consulta();

    public void menuInicial() {
        JOptionPane.showMessageDialog(null, "Agendar Consulta!!");
        int i = 0;

        do {
            i = Integer.parseInt(JOptionPane.showInputDialog("Digite uma das opções abaixo:\n\n0. Sair\n1. Agendar Consulta\n2. Verificar Consulta"));

            switch (i) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    System.exit(0);

                case 1:
                    con.cadastrarConsulta();
                    break;

                case 2:
                    con.exibirConsulta();
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }

        } while (i != 0);

    }
}
