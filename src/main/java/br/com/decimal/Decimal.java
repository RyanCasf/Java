package br.com.decimal;

import java.math.BigDecimal;

// Todo número que não é uma Derivação de Base 2 (Binário) será aproximado
public class Decimal 
{
	public static void main(String[] args) 
	{
		erroConversaoBinaria(0.2f, 0.2);
		
		declaracaoBigDecimal(new BigDecimal(0.2)); // d
		declaracaoBigDecimal(new BigDecimal(0.2f));
		declaracaoBigDecimal(new BigDecimal("0.2"));
	}
	
	public static void erroConversaoBinaria(float floatValue, double doubleValue)
	{
		System.out.println("Os valor são "
			+(floatValue == doubleValue ? " IGUAIS!" : " DIFERENTES!"));
	}
	
	public static void declaracaoBigDecimal(BigDecimal bigDecimalValue)
	{
		System.out.println(bigDecimalValue);
	}
}