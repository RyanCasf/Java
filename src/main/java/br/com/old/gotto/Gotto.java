package br.com.old.gotto;

public class Gotto {
	
	public static void main(String[] args) {
        for(int i=0; i<3; i++) {

            rotulo1: {
                rotulo2: {
                    if (i == 1) break rotulo1;
                    if (i != 2) break rotulo2;
                    
                    System.out.println("Entrada -> 2");
                } 
            }
		}

        System.out.println("Entrada -> 1");
	}
}