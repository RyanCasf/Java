import java.util.Scanner;
public class test {

    public static void main(String[] args) {
        
        // BREAK
        /* int i = 0;
        System.out.println("Contando\n");
        do{
            System.out.println("Número: " +i);
            if(i==5)
                break;
            i++;
        } while(i<11); */
        
        
        // SCANNER
        /* System.out.println("Entrada");
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com um número: ");
        int num = scan.nextInt();
            System.out.println("O número digitado foi: "+num); */
            
            
        // CONTINUE
        /*System.out.println("É PAR");
        
        for(int i=0; i<100; i++)
            if(i%2==0) 
                System.out.println(i +" é PAR");
            else
                continue;
        ... */
        
        
        // GOTO
        /* System.out.println("Teoria do Swicth");
        for(int i=0; i<2; i++)
            rotulo1: {
                rotulo2: {
                    if(i==1) break rotulo1;
                    if(i!=2) break rotulo2;     //Bizua fazer um extremo tipo Default
                System.out.println("Entrada -> 2");
                }
            System.out.println("Entrada -> 1");
            } */
    }
}