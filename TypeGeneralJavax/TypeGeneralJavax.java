import javax.swing.JOptionPane;
public class TypeGeneralJavax {

    public static void main(String[] args) {

        int number = 0; 
        String name, SSN; 
        double salary; 
        
        JOptionPane.showMessageDialog(null,"Register of employees");

        name =JOptionPane.showInputDialog("Type with employee name: "); 
        number = Integer.parseInt(JOptionPane.showInputDialog("Type with employee "
                + "identification code: ")); 
        SSN = JOptionPane.showInputDialog("Type with employee SSN [with the dots]: ");
        salary = Double.parseDouble(JOptionPane.showInputDialog("Type employee salary: "));
       
        JOptionPane.showMessageDialog(null,"DATA:\n"
                + "\nName: "+name+
                "\nSSN: "+SSN+
                "\nSalary: R$ "+salary+
                "\nIdentification code: "+number);
        }
}