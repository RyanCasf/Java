import javax.swing.JOptionPane;
public class EntradaSaida {
    
    public String EntradaDado(String msg) {
        String dado=JOptionPane.showInputDialog(msg);
        return dado;
    }
    
    public void SaidaDado(String msg){
        JOptionPane.showMessageDialog(null, msg);
    }
}