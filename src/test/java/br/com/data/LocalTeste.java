package br.com.data;

import java.time.LocalDate;

import org.junit.Assert;
import org.junit.Test;

public class LocalTeste {
	
    @Test
    public void dataAmanha() {
        LocalDate amanha = LocalDate.now().plusDays(1l);
        LocalDate amanhaTeste = Local.getDataAmanha();

        Assert.assertEquals(amanha, amanhaTeste);
    }
}