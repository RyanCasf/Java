package br.com.data;

import java.util.Calendar;

import org.junit.Assert;
import org.junit.Test;

public class CalendarioTeste {
	private Calendario calendario = new Calendario();
	
	@Test
	public void horarioAtual() {
		Assert.assertEquals(Calendar.getInstance().get(Calendar.DATE), calendario.horarioAtual().get(Calendar.DATE));
	}
}