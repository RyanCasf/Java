package br.com.collection.queues;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class Queues {
	private static final Random random = new Random();
	private static final String TEMA = "\tFirst In First Out!\n";

	public static void main(String[] args) {
		System.out.println(TEMA.toUpperCase());

		queueRender();
		priorityRender();
	}

	private static void priorityRender() {
		System.out.println("\nORDER BY ASC");

		Queue<Double> queueOrder = new PriorityQueue<>();
		// Queue<Double> queueOrderDesc = new
		// PriorityQueue<Double>(Collections.reverseOrder());
		queueOrder.addAll(fetchQueue(10));

		while (!queueOrder.isEmpty()) {
			System.out.println("-" + queueOrder.poll());
		}
		System.out.println("End : " + queueOrder.toString());
	}

	private static void queueRender() {
		Queue<Double> queue = fetchQueue(4);

		System.out.println("*First: " + queue.poll());
		while (!queue.isEmpty()) {
			System.out.println("First now: " + queue.poll());
		}
		System.out.println("End : " + queue.toString());
	}

	private static Queue<Double> fetchQueue(int tamanho) {
		Queue<Double> queue = new LinkedList<>();
		for (int i = 0; i < tamanho; i++) {
			queue.offer(random.nextDouble());
		}
		return queue;
	}
}