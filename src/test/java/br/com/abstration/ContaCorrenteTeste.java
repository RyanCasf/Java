package br.com.abstration;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class ContaCorrenteTeste {

    @Test
    public void configNovaConta() {
        ContaCorrente conta = new ContaCorrente();

        Assert.assertEquals(BigDecimal.ZERO, conta.getSaldo());
    }
}