public class controleReserva {
    
    Cliente cli = new Cliente();
    Reserva res = new Reserva();
    Hotel hot = new Hotel();
    
    public void cadastrarCliente(String nome, String telefone) {
        cli.setNome(nome);
        cli.setTelefone(telefone);
    }
    
    public void cadastrarHotel(float diaria) {
        hot.setDiaria(diaria);
    }
    
    public void cadastrarReserva(String data, String hora, String per, int numQuarto) {
        res.setData(data);
        res.setHora(hora);
        res.setNumQuartos(numQuarto);
        res.setPeriodo(per);
    }
    
    public String exibirCadastrar() {
        String msg = "DADOS\n\nNome: "+this.cli.getNome() +"\nTelefone: "+this.cli.getTelefone() +"\nData: "+this.res.getData() +"\nHora: "
                +this.res.getHora() +"\nPeríodo: "+this.res.getPeriodo() +"\nNúmero(s) de quarto(s): "+this.res.getNumQuartos() +"\nDiária: "
                +this.hot.getDiaria();
        return msg;
    }
}