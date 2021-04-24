import javax.swing.*;
import java.awt.*;
public class jPanel extends JFrame{

    private JButton incluir;
    private JButton excluir;
    private JButton alterar;
    private JButton pesquisar;
    private JLabel nome;
    private JLabel idade;
    private JLabel RGM;
    JTextField caixa = new JTextField(10);
    JTextField box = new JTextField(10);
    JTextField caixote = new JTextField(10);
    private JPanel p1;
    private JPanel p2;
    private JPanel p3;
        
    public jPanel() {
        super("Cadastro!");
        this.getContentPane().setLayout(new GridLayout(1,3));
    }
    
    public void init() {
        incluir = new JButton("Incluir");
        excluir = new JButton("Excluir");
        alterar = new JButton("Alterar");
        pesquisar = new JButton("Pesquisar");
        nome = new JLabel("Nome:                                  ");
        idade = new JLabel("Idade:                              ");
        RGM = new JLabel("RGM:                              ");
        p1 = new JPanel(new GridLayout(3,1));
        p2 = new JPanel(new GridLayout(3,1));
        p3 = new JPanel(new GridLayout(3,1));
        
        p1.add(incluir);
        p1.add(excluir);
        p1.add(alterar);
        p1.add(pesquisar);
        
        p2.add(nome);
        p2.add(idade);
        p2.add(RGM);
        
        p3.add(caixa);
        p3.add(caixote);
        p3.add(box);
        
        this.getContentPane().add(p1);
        this.getContentPane().add(p2);
        this.getContentPane().add(p3);
        
        setSize(600,150);
        setVisible(true);
    }
    
    public static void main(String[] args) {
    	jPanel jP = new jPanel();
        jP.init();
    }
}