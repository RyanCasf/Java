import java.util.ArrayList;
import java.util.List;

public class addAll
{
    private static List<Long> chaves;

    public static void main(String a[])
    {
        System.out.println("Demonstrando Chaves!");
        chaves = new ArrayList<>();
        chaves.add(1L);

        List<Long> chavesAdd;
        chavesAdd = new ArrayList<>();
        chavesAdd.add(3L);
        chavesAdd.add(5L);

        chaves.addAll(chavesAdd);

        for (Long chave : chaves)
        {
            System.out.println("Chave: "+chave);
        }
    }
}