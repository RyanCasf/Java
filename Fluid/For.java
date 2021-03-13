package Fluid;

public class For 
{
	static int a[] = new int[10];
	// Erros comuns do Array
	// -> Esquecer que começa do Zero;
	// -> Somentte <> se colocar o igual" perde o Zero".
	
	public static void main(String[] args) 
	{
		int z=10, y=2, x=5;
		String txt = (z>y ? "Zé" : (z>x? "Z é maior que Y!" 
				: "Z é menor que Y"));
		// colocar o segundo ternário no último
		ternary();
		for( int controle : a ) 
		{
			System.out.println(controle);
		}
	}
	
	public static int ternary() 
	{
		for (int i=0; i<10; i++) 
		{
			a[i] = i; // * zero
			return i==1 ? a[i] & i++ : i++;
		}
		return 0;
	}
}