package br.com.functional;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

public class FunctionalTeste {
	private static final int PARAM = 0;
	
	@Test
	public void lambdas() {
		int resultDirectStatic = increment(PARAM);
		int resultByFunction = Functions.incrementByFunction.apply(PARAM);

		Assert.assertEquals(1, resultDirectStatic);
		Assert.assertEquals(1, resultByFunction);
		
		BigDecimal multiply = Functions.multiplyByFunction.apply(new BigDecimal[] { BigDecimal.TEN, BigDecimal.TEN });
		multiply = Functions.multiplyTwoByFunction.apply(BigDecimal.TEN, BigDecimal.TEN);
		Assert.assertEquals((BigDecimal.valueOf(100)), multiply);
	}

	static int increment(int number) {
		return (number + 1);
	}
}