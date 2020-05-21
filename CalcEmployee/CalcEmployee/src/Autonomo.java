public class Autonomo extends Funcionario{
    
    private float horas, valorHora;

    public float getHoras() {
        return horas;
    }

    public void setHoras(float horas) {
        this.horas = horas;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }
    
    public String calcularSalario(){
        this.setSalarioTotal(this.getHoras() * this.getValorHora());
        return "DADOS\n\nSalário final: R$ "+this.getSalarioTotal();
    }
}