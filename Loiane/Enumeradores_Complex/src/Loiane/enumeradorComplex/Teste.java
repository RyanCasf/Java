package Loiane.enumeradorComplex;
import Loiane.enumeradorComplex.Enum;
import java.util.Scanner;

public class Teste 
{
    private Sexo sexo;
    
    public static void main(String[] a)
    {
        System.out.println(desk());
    }
    
    enum Descktop
    {
        Computador, Notebook, Tablet;
    }
    
    public static String desk()
    {
        String msg;
        
        Descktop descktop = Descktop.Computador;
        
        switch(descktop)
        {
            case Computador:
                msg = "Computador";
                break;
                
            case Notebook:
                msg = "Notebook";
                break;
                
            case Tablet:
                msg = "Tablet";
                break;
                
            default:
                msg = "Opção inválida";
        }
        
        return msg;
    }
}