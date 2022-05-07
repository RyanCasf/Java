package br.com.sort;

import org.junit.Assert;
import org.junit.Test;

public class ModelTeste {

    @Test
    public void gerandoConstrutoresValidos() {
        Assert.assertNotNull(new Model(null, null, null));
        Assert.assertNotNull(new Model(1, null, null));
    }

    @Test(expected = IllegalCallerException.class)
    public void confirmandoErroConstrutorModel() {
        new Model();
    }
}