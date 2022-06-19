package br.com.data;

import java.text.ParseException;
import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

public class DataTeste {

	@Test
    public void textToDate() {
    	Date date = Data.getDate(16, 6, 2022);
    	
    	Assert.assertEquals(16, date.getDate());
    	Assert.assertEquals((6 - 1), date.getMonth());
    	Assert.assertEquals((2022 - 1900), date.getYear());
    }
	
	@Test(expected = ParseException.class)
	public void sdfToDate() throws ParseException {
		Date date = new Date();
		Assert.assertEquals(date, Data.getDate("dd/MM/yyyy.", date.toString()));
	}
}