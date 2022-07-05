package br.com.abstration;

import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;

public class ContaCorrente {
    private String numero;
    private BigDecimal saldo = BigDecimal.ZERO;
    private BigDecimal limite = BigDecimal.ZERO;

    @NotNull
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

    @NotNull
    public void depositar(BigDecimal valor) {
        if (valor == null || valor.compareTo(BigDecimal.ZERO) <= 0) {
            return;
        }

        saldo = saldo.add(valor);
    }

    public BigDecimal getSaldo() {
        return saldo;
    }
}