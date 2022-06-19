package br.com.data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Data {

	public static Date getDate(int day, int month, int year) {
		Date temp = new Date();
		
		temp.setDate(day);
		temp.setMonth((month - 1));
		temp.setYear((year - 1900));
		
		return temp;
	}
	
	public static Date getDate(String formatacao, String dataExtenso) throws ParseException {
		if ((formatacao == null || formatacao.trim().equals("")) || (dataExtenso == null || dataExtenso.trim().equals(""))) {
			return null;
		}
		
		return new SimpleDateFormat(formatacao).parse(dataExtenso);
	}
}