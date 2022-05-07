package br.com.sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ModelController {
	private static final Random random = new Random();

	public static List<Model> fetchModels(int quantidade) {
		List<Model> temp = new ArrayList<Model>();

		for (int i = 0; i < quantidade; i++) {
			temp.add(new Model(i, "" + i, "" + i));
			int tamanhoParaLista = Math.abs(random.nextInt(10) + 1);

			for (int j = 0; j < tamanhoParaLista; j++)
				temp.get(i).getModelsFilhos().add(new Model(j, "" + j, "" + j));
		}

		return temp;
	}
}