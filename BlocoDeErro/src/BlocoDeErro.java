public class BlocoDeErro {

    public static void main(String[] args) {
        int[] num = {4, 8, 16, 21, 32, 64, 128};
        int[] den = {2, 2, 4, 7, 2, 2, 2};
        
        for( int i=0; i<num.length; i++  ){
           try {
               if(num[i] % 2 != 0) {
                   throw new NaoInteiroExc(num[i], den[i]);
               }
           } catch (NaoInteiroExc e) {
               System.out.println("Bloco de erro construido correto");
           } catch (Exception exc) {
               System.out.print("Erro: "+exc);
           }
        }
    }
}