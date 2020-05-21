import javax.swing.JOptionPane;
public class ControleSalario {
    
    Mensalista mens = new Mensalista();
    Autonomo aut = new Autonomo();
    Vendedor ven = new Vendedor();
    
    public void exibirMensalista(float salarioBase, float desconto) {
        mens.setDescontos(desconto);
        mens.setSalarioBase(salarioBase);
        String msg = mens.calcularSalario();
        JOptionPane.showMessageDialog(null, msg);
    }
    
    public void exibirVendedor(float comissao, float totalVenda) {
        ven.setComissao(comissao);
        ven.setTotalVenda(totalVenda);
        String msg = ven.calcularSalario();
        JOptionPane.showMessageDialog(null, msg);
    }
    
    public void exibirAutonomo(float horas, float valorHora) {
        aut.setHoras(horas);
        aut.setValorHora(valorHora);
        String msg = aut.calcularSalario();
        JOptionPane.showMessageDialog(null, msg);
    }
}