package br.com.sort;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ModelControllerTeste {

    @Test
    public void fetchPositivo() {
        List<Model> temp = ModelController.fetchModels(1);

        Assert.assertNotNull(temp);
        Assert.assertNotEquals(temp, new ArrayList<Model>());
    }

    @Test
    public void fetchNegativo() {
        List<Model> temp = ModelController.fetchModels(-1);

        Assert.assertNotNull(temp);
        Assert.assertEquals(temp, new ArrayList<Model>());
    }

    @Test
    public void fetchZerado() {
        List<Model> temp = ModelController.fetchModels(0);

        Assert.assertNotNull(temp);
        Assert.assertEquals(temp, new ArrayList<Model>());
    }
}