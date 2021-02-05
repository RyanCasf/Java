public class Produtos {
    public String nome, msg;
    public double valor;
    public int quant;
    
    public void CadastrarProdutos(Conversor Conv, EntradaSaida IO) {
        try{
            msg = "Qual o nome do produto: ";
            this.nome = IO.EntradaDado(msg);
            msg = "Qual o valor do produto: ";
            this.valor = Conv.ConvertToDouble(IO.EntradaDado(msg));
            msg = "Qual(is) a(s) quantidade(s) produto(s): ";
            this.quant = Conv.ConvertToInt(IO.EntradaDado(msg));
        } catch (Exception e) {
            msg = "Preencha corretamente\nErro: "+e;
            IO.SaidaDado("Erro: "+msg);
        }
    }
    
    public String exibirProdutos() {
        if(this.quant != 0){
            msg = "\nDADOS Produto:\nNome: "+this.nome+"\nValor: "+this.valor+"\nQuantidade: "+this.quant;
            return msg;
        } else{
            return null;
        }
    }
}