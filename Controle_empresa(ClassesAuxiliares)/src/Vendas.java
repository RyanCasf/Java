public class Vendas {
    
    private int tot_vendas;
    private String nome_Func;
    String msg;
    
    public void CadastrarVendas(Conversor Conv, EntradaSaida IO) {
        try{
            msg = "Qual o total de vendas: ";
            this.setTot_vendas(Conv.ConvertToInt(IO.EntradaDado(msg)));
            msg = "Qual o nome do funcionário que efetuou a venda: ";
            this.setNome_Func(IO.EntradaDado(msg));
        } catch (Exception e) {
            msg = "Preencha corretamente\nErro: "+e;
            IO.SaidaDado("Erro: "+msg);
        }
    }
    
    public String exibirVendas () {
        if(this.getTot_vendas() != 0){
            msg = "\nDADOS Funcionário:\nNome funcionário: "+this.getNome_Func()+"\nTotal de vendas: "+this.getTot_vendas();
            return msg;
        } else{
            return null;
        }
    }

    public int getTot_vendas() {
        return tot_vendas;
    }

    public void setTot_vendas(int tot_vendas) {
        this.tot_vendas = tot_vendas;
    }

    public String getNome_Func() {
        return nome_Func;
    }

    public void setNome_Func(String nome_Func) {
        this.nome_Func = nome_Func;
    }
}