import javax.swing.JOptionPane;
public class Controle_Eleicao {
    
    Deputado_Federal depFed = new Deputado_Federal();
    Deputado_Estadual depEst = new Deputado_Estadual();
    Presidente pre = new Presidente();
    Senador sen = new Senador();
    
    public boolean validaVoto(String tituloEleitor, String nome){
        if(nome.trim().length() > 0 && tituloEleitor.length() >= 12) {
            JOptionPane.showMessageDialog(null, "Iniciando a votação!");
            new GUI_votacao().setVisible(true);
            return false;
        }
        JOptionPane.showMessageDialog(null, "Preencha os dados corretamente!");
        return true; 
    }
    
    public void votoSenador() {
        JOptionPane.showMessageDialog(null, "Guarde as informações para assegurar o seu Voto");
        JOptionPane.showMessageDialog(null, sen.candidatoSen);
        int inv = Integer.parseInt(JOptionPane.showInputDialog("Branco - 2" +"\n\nEntre com o"
                + " número do(a) seu(a) candidato(a) para Senador(a): "));
        sen.votos[inv] += 1;
        JOptionPane.showMessageDialog(null, "VOTO!\n\nConfirmado");
    }
    
    public void votoDepEst() {
        JOptionPane.showMessageDialog(null, "Guarde as informações para assegurar o seu Voto");
        JOptionPane.showMessageDialog(null, depEst.candidatoDepEst);
        int inv = Integer.parseInt(JOptionPane.showInputDialog("Branco - 2" +"\n\nEntre com o"
                + " número do(a) seu(a) candidato(a) para Deputado(a) Estadual: "));
        depEst.votos[inv] += 1;
        JOptionPane.showMessageDialog(null, "VOTO!\n\nConfirmado");
    }
    
    public void votoDepFed() {
        JOptionPane.showMessageDialog(null, "Guarde as informações para assegurar o seu Voto");
        JOptionPane.showMessageDialog(null, depFed.candidatoDepFed);
        int inv = Integer.parseInt(JOptionPane.showInputDialog("Branco - 2" +"\n\nEntre com o"
                + " número do(a) seu(a) candidato(a) para Deputado(a) Federal: "));
        depFed.votos[inv] += 1;
        JOptionPane.showMessageDialog(null, "VOTO!\n\nConfirmado");
    }
    
    public void votoPres() {
        JOptionPane.showMessageDialog(null, "Guarde as informações para assegurar o seu Voto");
        JOptionPane.showMessageDialog(null, pre.candidatoPres);
        int inv = Integer.parseInt(JOptionPane.showInputDialog("Branco - 2" +"\n\nEntre com o"
                + " número do(a) seu(a) candidato(a) para Presidente(a): "));
        depFed.votos[inv] += 1;
        JOptionPane.showMessageDialog(null, "VOTO!\n\nConfirmado");
    }
}