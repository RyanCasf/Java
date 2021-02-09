import javax.swing.JOptionPane;

public class Consulta {

    Medico med = new Medico();
    Paciente pac = new Paciente();

    String data, hora;

    public void cadastrarConsulta() {
        this.med.crm = JOptionPane.showInputDialog("Cadastrar o CRM do médico: ");
        this.med.especialidade = JOptionPane.showInputDialog("Cadastrar a especialidade do médico: ");
        this.med.cep = JOptionPane.showInputDialog("Digite o CEP do médico: ");
        this.med.cpf = JOptionPane.showInputDialog("Digite o CPF do médico: ");
        this.med.nome = JOptionPane.showInputDialog("Digite o nome do médico: ");
        this.pac.cep = JOptionPane.showInputDialog("Digite o cep do paciente: ");
        this.pac.cpf = JOptionPane.showInputDialog("Digite o CPF do paciente: ");
        this.pac.nome = JOptionPane.showInputDialog("Degite o nome do paciente: ");
        this.pac.nomeConvenio = JOptionPane.showInputDialog("Digite o nome do convenio do paciente: ");
        this.pac.numeroConvenio = JOptionPane.showInputDialog("Digite o número de identificação do paciente no convenio: ");
        this.data = JOptionPane.showInputDialog("Digite a hora da consulta: ");
        this.hora = JOptionPane.showInputDialog("Digite a hora da consulta: ");
    }

    public void exibirConsulta() {
        JOptionPane.showMessageDialog(null, "CONSULTA\n\n*-*-*-*-*-*-*-*-*-**-*-*-*-*\nMédico:\nNome: " + med.nome + "\nCEP: " + med.cep + "\nCPF: " + med.cpf
                + "\nEspecialidade: " + med.especialidade + "\nCRM: " + med.crm + "\n*-*-*-*-*-*-*-*-*-**-*-*-*-*\nPaciente: \nNome: " + pac.nome + "\nCEP: " + pac.cep
                + "\nCPF: " + pac.cpf + "\nConvenio: " + pac.nomeConvenio + "\nNúmero do convenio: " + pac.numeroConvenio + "\n*-*-*-*-*-*-*-*-*-**-*-*-*-*\nConsulta\nData: "
                + this.data + "\nHora: " + this.hora);
    }
}