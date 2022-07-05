package br.com.abstration;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class ContaCorrenteTeste {

    @Test
    public void configNovaConta() {
        ContaCorrente conta = new ContaCorrente();

        Assert.assertEquals(BigDecimal.ZERO, conta.getSaldo());

        conta.depositar(null);
        Assert.assertEquals(BigDecimal.ZERO, conta.getSaldo());

        Assert.assertFalse(conta.sacar(null));
        Assert.assertEquals(BigDecimal.ZERO, conta.getSaldo());
    }

    @Test
    public void sacarNegativo() {
        ContaCorrente conta = new ContaCorrente();

        Assert.assertFalse(conta.sacar(BigDecimal.valueOf(-20f)));
        Assert.assertEquals(BigDecimal.ZERO, conta.getSaldo());

        Assert.assertFalse(conta.sacar(BigDecimal.ZERO));
        Assert.assertEquals(BigDecimal.ZERO, conta.getSaldo());
    }

    @Test
    public void sacarSemSaldo() {
        ContaCorrente conta = new ContaCorrente();

        conta.depositar(BigDecimal.valueOf(200f));
        conta.depositar(BigDecimal.valueOf(200f));

        Assert.assertTrue(conta.sacar(BigDecimal.valueOf(300f)));
        Assert.assertFalse(conta.sacar(BigDecimal.valueOf(300f)));
    }

    @Test
    public void sacar() {
        ContaCorrente conta = new ContaCorrente();

        Assert.assertFalse(conta.sacar(BigDecimal.valueOf(-20f)));
        Assert.assertEquals(BigDecimal.ZERO, conta.getSaldo());

        Assert.assertFalse(conta.sacar(BigDecimal.ZERO));
        Assert.assertEquals(BigDecimal.ZERO, conta.getSaldo());
    }

    @Test
    public void depositarNegativo() {
        ContaCorrente conta = new ContaCorrente();

        conta.depositar(BigDecimal.valueOf(-20f));
        Assert.assertEquals(BigDecimal.ZERO, conta.getSaldo());

        conta.depositar(BigDecimal.ZERO);
        Assert.assertEquals(BigDecimal.ZERO, conta.getSaldo());
    }

    @Test
    public void depositar() {
        ContaCorrente conta = new ContaCorrente();

        conta.depositar(BigDecimal.valueOf(20f));
        Assert.assertEquals(BigDecimal.valueOf(20f), conta.getSaldo());
    }
}