package br.com.functional;

import java.math.BigDecimal;

public class Lambda {
	private static final int PARAM = 0;
	
	public static void main(String[] args) {
		int resultDirectStatic = increment(PARAM);
		int resultByFunction = Functions.incrementByFunction.apply(PARAM);

		System.out.println("01. : " + resultDirectStatic + "\n02. : " + resultByFunction);
		
		BigDecimal multiply = Functions.multiplyByFunction.apply(new BigDecimal[] { BigDecimal.TEN, BigDecimal.TEN });
		System.out.println("\n10 * 10 = " + multiply);
		
		multiply = Functions.multiplyTwoByFunction.apply(BigDecimal.TEN, BigDecimal.TEN);
		System.out.println("\n10 * 10 = " + multiply);
	}

	static int increment(int number) {
		return (number + 1);
	}
}