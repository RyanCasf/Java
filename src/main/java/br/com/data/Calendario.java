package br.com.data;

import java.util.Calendar;

public class Calendario {
	private Calendar calendar;
	
	public Calendar horarioAtual() {
		return getCalendar();
	}
	
	public void mostrar() {
		getCalendar();
		
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println(calendar.get(Calendar.MONTH) + 1);
		System.out.println(calendar.get(Calendar.MINUTE) + 1);
	}
	
	public Calendar getCalendar() {
		calendar = Calendar.getInstance();
		return calendar;
	}
}