package br.com.data;

import java.time.LocalDate;
import java.util.Date;

public class Local {
	
	public static LocalDate getDataAmanha() {
		return LocalDate.now().plusDays(1);
	}
	
	public static Date getDate(int day, int month, int year) {
		Date temp = new Date();
		
		temp.setDate(day);
		temp.setMonth((month - 1));
		temp.setYear((year - 1900));
		
		return temp;
	}
}