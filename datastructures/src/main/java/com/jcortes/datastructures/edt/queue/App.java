package com.jcortes.datastructures.edt.queue;

public class App {

	/*public static void main(String[] args) {
		processQueue();
	}*/

	public static void processQueue() {
		Queue queue = new Queue(5);
		queue.insert(23);
		queue.insert(15);
		queue.insert(45);
		queue.insert(50);
		queue.insert(87);
		queue.insert(90);

		queue.view();
	}
}
