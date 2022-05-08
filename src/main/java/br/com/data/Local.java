package br.com.data;

import java.time.LocalDate;

public class Local {
	public static LocalDate getDataAmanha() {
		return LocalDate.now().plusDays(1);
	}
}