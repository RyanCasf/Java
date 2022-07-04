package br.com.abstration;

import java.math.BigDecimal;

public class ContaCorrente {
    private String numero;
    private BigDecimal saldo = BigDecimal.ZERO;
    private BigDecimal limite = BigDecimal.ZERO;

    public boolean sacar(BigDecimal valor) {
        if (saldo.compareTo(BigDecimal.ZERO) <= 0) {
            return false;
        }

        if (valor == null || valor.compareTo(BigDecimal.ZERO) <= 0) {
            return false;
        }

        if (valor.compareTo(saldo) > 0) {
            return false;
        }

        saldo = saldo.subtract(valor);
        return true;
    }

    public void depositar(BigDecimal valor) {
        saldo = saldo.add(valor);
    }

    public BigDecimal getSaldo() {
        return saldo;
    }
}