public class Menu {
        Funcionario F = new Funcionario();
        Produtos P = new Produtos();
        Vendas V = new Vendas();
        Fornecedor FO = new Fornecedor();
        EntradaSaida IO = new EntradaSaida();
        Conversor Conv = new Conversor();
        String msg = null;
    
    void MenuInicial() {
        int op = 0;
        do{
            try {
            op=Conv.ConvertToInt(IO.EntradaDado("\tMENU DE OPÇÕES\n"
                + "\n 1 - Cadastrar Funcionários"
                + "\n 2 - Cadastrar Produtos"
                + "\n 3 - Cadastrar Vendas"
                + "\n 4 - Cadastrar Fornecedor"
                + "\n 5 - Exibir todos os dados"
                + "\n 0 - Sair\n"));
            } catch(NumberFormatException e) {
                msg = "Somente números são aceitos";
                IO.SaidaDado(msg);
                MenuInicial();
            } catch (Exception e) {
                msg = "Preencha corretamente\nErro: "+e;
                IO.SaidaDado("Erro: "+msg);
                MenuInicial();
            }
        
        switch(op) {
            case 1:
                F.CadastrarFunc(Conv, IO);
            break;
            case 2:
                P.CadastrarProdutos(Conv, IO);
            break;
            case 3:
                V.CadastrarVendas(Conv, IO);
            break;
            case 4:
                FO.CadastrarFornecedor(Conv, IO);
            break;
            case 5:
                msg = (V.exibirVendas()!= null ? V.exibirVendas() : "");
                msg += (P.exibirProdutos()!= null ? P.exibirProdutos() : "");
                msg += (F.ExibirDados()!= null ? F.ExibirDados() : "");
                msg += (FO.exibirFornecedor()!= null ? FO.exibirFornecedor() : "");
                IO.SaidaDado(msg.equals("") ? "Nada Cadastrado!" : (msg));
            break;
            case 0:
                IO.SaidaDado("Saindo...");
            break;
            default:
                IO.SaidaDado("A opção digita é inválida");
            break;
        }
        }while(op!=0);
    }
}