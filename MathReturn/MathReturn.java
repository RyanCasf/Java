class MathReturn {
	
	public static void main(String[] a) {
		int result = ( f1() + f2() );
		System.out.println(result+"\n");  
		// Output 2
	}

	static int f1() {
		System.out.println("");
		return 1;
	}

	static int f2() {
		System.out.println("");
		return 1;
	}
}