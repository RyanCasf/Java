package br.com.functional;

import java.math.BigDecimal;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Functions {
	//	Function<T, R> Input and Output 
	public static final Function<Integer, Integer> incrementByFunction = number -> (number + 1);
	public static final Function<Integer, Integer> divideByFunction = number -> (number / 1);
	
	public static final BiFunction<BigDecimal, BigDecimal, BigDecimal> multiplyTwoByFunction =
			(number1, number2) -> (number1.multiply(number2));
			
	public static final Function<BigDecimal[], BigDecimal> multiplyByFunction = number -> (number[0].multiply(number[1]));
}