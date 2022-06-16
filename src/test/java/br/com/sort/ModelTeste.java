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

    @Test
    public void refenciandoObjetos() {
        Model model1 = new Model(1, "A", "A");
        Model model2 = new Model(2, "B", "B");

        model2 = model1;
        model2.setChave(2);

        System.out.println(model1.toString());
        System.out.println(model1.toString());

        Assert.assertEquals(model1, model2);
    }
}