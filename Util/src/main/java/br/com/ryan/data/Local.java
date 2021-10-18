package br.com.ryan.data;

import java.time.LocalDate;

// java.time.LocalDate
public class Local 
{
	static LocalDate localDate = LocalDate.now();
	
	public static void main(String[] args) 
	{
		System.out.println(localDate.toString());
		System.out.println("Dia da semana: " +localDate.getDayOfWeek().ordinal() +" - "+ localDate.getDayOfWeek().name());
		System.out.println("Mês: " + localDate.getMonthValue() + " - " + localDate.getMonth().name());
		System.out.println("Ano: " + localDate.getYear());
	}
}