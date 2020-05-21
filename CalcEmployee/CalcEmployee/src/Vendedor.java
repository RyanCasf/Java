public class Vendedor extends Funcionario{
    
    private float comissao, totalVenda;

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    public float getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(float totalVenda) {
        this.totalVenda = totalVenda;
    }
    
    public String calcularSalario(){
        this.setSalarioTotal(this.getTotalVenda() * this.getComissao() / 100);
        return "DADOS\n\nSalário final: R$ "+this.getSalarioTotal();
    }
}