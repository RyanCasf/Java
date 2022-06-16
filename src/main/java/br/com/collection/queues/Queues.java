package br.com.collection.queues;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues {
	
	public static List<Double> priorityRender(List<Double> lista) {
		if (lista == null || lista.isEmpty()) {
			return Collections.emptyList();
		}
		
		Queue<Double> queueOrder = new PriorityQueue<Double>(lista);
//		Queue<Double> queueOrder = PriorityQueue<Double>(Collections.reverseOrder());

		List<Double> result = new ArrayList<Double>();
		while (!queueOrder.isEmpty()) {
			result.add(queueOrder.poll());
		}
		
		return result;
	}
}