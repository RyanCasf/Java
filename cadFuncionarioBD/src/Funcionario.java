public class Funcionario {

    menuFunc mf = new menuFunc();
    
    String nome, setor;
    private int codigo;
    private double salario;
    
    public static void main(String[] args) {
        new menuFunc().setVisible(true);
    }
    
    public void cadastrarFunc(String nome, String setor, int codigo, double salario) {
        this.nome = (nome);
        this.setor = (setor);
        this.setCodigo(codigo);
        this.setSalario(salario);
    }

    public String exibirFunc() {
        return "DADOS\n\nCódigo: "+this.getCodigo()+"\nNome: "+this.nome+"\nSetor: "+this.setor+"\nSalário: R$"+this.getSalario();
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}