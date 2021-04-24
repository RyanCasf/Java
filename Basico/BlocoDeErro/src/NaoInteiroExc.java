public class NaoInteiroExc extends Exception {
    protected int num, denom;
    
    public NaoInteiroExc(int num, int denom) {
        super();
        this.num = num;
        this.denom = denom;
    }
    
    public String toString() {
        return "Erro matemático, divisão incapaz de ter solução 'direte'";
    }
}