public class Mensalista extends Funcionario{
    
    private float salarioBase, descontos;
    
    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public float getDescontos() {
        return descontos;
    }

    public void setDescontos(float descontos) {
        this.descontos = descontos;
    }
    
    public String calcularSalario(){
        this.setSalarioTotal(this.getSalarioBase() - this.getDescontos());
        return "DADOS\n\nSalário final: R$ "+this.getSalarioTotal();
    }
}