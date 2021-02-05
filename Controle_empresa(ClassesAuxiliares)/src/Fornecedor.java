public class Fornecedor {
    
    public String nome, nome_prod, msg;
    private int quantidade;
    public double valor;
    
    public void CadastrarFornecedor(Conversor Conv, EntradaSaida IO) {
        try{
            msg = "Qual o nome do fornecedor: ";
            this.nome = IO.EntradaDado(msg);
            msg = "Qual o nome do produto: ";
            this.nome_prod = IO.EntradaDado(msg);
            msg = "Qual a quantidade do produto: ";
            this.quantidade = Conv.ConvertToInt(IO.EntradaDado(msg));
            msg = "Qual o valor unitário do produto: ";
            this.valor = Conv.ConvertToDouble(IO.EntradaDado(msg));
        } catch (Exception e) {
            msg = "Preencha corretamente\nErro: "+e;
            IO.SaidaDado("Erro: "+msg);
        }
    }
    
    public String exibirFornecedor() {
        if(this.valor != 0){
            msg = "\nDADOS Fornecedor:\nNome: "+this.nome+"\nNome do produto: "+this.nome_prod+"\nQuantidade: "+this.quantidade+"\nValor (unitário): "+this.valor;
            return msg;
        } else{
            return null;
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}