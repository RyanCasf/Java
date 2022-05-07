package br.com.sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Sort {
	private static List<Model> models = ModelController.fetchModels(3);

	public static void main(String[] args) {
		sortOldView();
		sortNewView();
	}

	private static void sortNewView() {
		models = ModelController.fetchModels(10);
		models.sort(Comparator.comparing(m -> m.getModelsFilhos().size()));
		List<Long> chaves = new ArrayList<>();
		models.forEach(m -> chaves.add(m.getChave()));
		System.out.println(chaves.toString());
	}

	private static void sortOldView() {
		sortOld();
		List<Long> chaves = new ArrayList<>();
		models.forEach(m -> chaves.add(m.getChave()));
		System.out.println(chaves.toString());
	}

	private static void sortOld() {
		models.sort((m1, m2) -> {
			if (m1.getModelsFilhos().size() < m2.getModelsFilhos().size()) {
				return -1;
			}

			if (m1.getModelsFilhos().size() > m2.getModelsFilhos().size()) {
				return 1;
			}

			return 0;
		});
	}
}