package br.com.data;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.Date;

public class LocalTeste {
	
    @Test
    public void dataAmanha() {
        LocalDate amanha = LocalDate.now().plusDays(1l);
        LocalDate amanhaTeste = Local.getDataAmanha();

        Assert.assertEquals(amanha, amanhaTeste);
    }
    
    @Test
    public void textToDate() {
    	Date date = Local.getDate(16, 6, 2022);
    	
    	Assert.assertEquals(16, date.getDate());
    	Assert.assertEquals((6 - 1), date.getMonth());
    	Assert.assertEquals((2022 - 1900), date.getYear());
    }
}