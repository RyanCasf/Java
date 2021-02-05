public class Funcionario {
    
    public String nome;
    private int horas_trab;
    private double ganho_hora;
    private int idade;
    public int entrada_emp;
    String msg;
    
    public void CadastrarFunc(Conversor Conv, EntradaSaida IO) {
        try{
            msg="Qual o seu nome: ";
            this.nome = IO.EntradaDado(msg);
            msg="Qual sua Idade: ";
            this.idade = Conv.ConvertToInt(IO.EntradaDado(msg));
            msg="Ano que você entrou na empresa: ";
            this.entrada_emp = Conv.ConvertToInt(IO.EntradaDado(msg));
            msg="Quantas horas têm sua jornada de trabalho diária: ";
            this.horas_trab = Conv.ConvertToInt(IO.EntradaDado(msg));
            msg="Qual é seu ganho por hora: ";
            this.ganho_hora = Conv.ConvertToDouble(IO.EntradaDado(msg));
        } catch (Exception e) {
            msg = "Preencha corretamente\nErro: "+e;
            IO.SaidaDado("Erro: "+msg);
        }
    }
    
    public void SalarioFunc(Conversor Conv, EntradaSaida IO) {
        double Sal=this.GetHorasTrab()*this.GetGanhoHora();
        this.SetGanhoHora(Sal);
        msg="Seu salário diário: "+this.GetGanhoHora()+
                "\nSalário semanal: "+(this.GetGanhoHora()*7)+
                "\nSalário mensal: "+(this.GetGanhoHora()*30);
        IO.SaidaDado(msg);
    }
    
    public String ExibirDados() {
        if(this.ganho_hora != 0){
            msg = "\nDADOS Funcionário:\nNome: "+this.nome+"\nIdade: "+this.idade+"\nTempo de Entrada (nº cheio): "+this.entrada_emp
                    +"Horas de serviço: "+this.horas_trab+"\nGanho por hora: "+this.ganho_hora;
            return msg;
        } else{
            return null;
        }
    }

    public int GetHorasTrab() {
        return horas_trab;
    }
    
    public void SetHorasTrab(int HT) {
        this.horas_trab=HT;
    }

    public double GetGanhoHora() {
        return ganho_hora;
    }
    
    public void SetGanhoHora(double GH) {
        this.ganho_hora=GH;
    }

    public int GetIdade() {
        return idade;
    }
    
    public void SetIdade(int ID) {
        this.idade=ID;
    }  
}