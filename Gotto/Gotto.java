class Gotto {
	public static void main(String[] args) {

		System.out.println("Teory of the Swicth");
        for(int i=0; i<2; i++) {

            rotulo1: {
                rotulo2: {
                    if(i==1) break rotulo1;
                    if(i!=2) break rotulo2;     //Bizu fazer um extremo tipo Default
                System.out.println("Entrada -> 2");
    	    } 
    	}
		}

        System.out.println("Entrada -> 1");
	}
}