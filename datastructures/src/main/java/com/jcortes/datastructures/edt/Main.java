package com.jcortes.datastructures.edt;

public class Main {

	public void usingCounter() {
		Counter counter = new Counter("counter class");

		System.out.println("initial value: " + counter.getCurrentValue());

		counter.increment();
		counter.increment();
		System.out.println("value after 2 incr: " + counter.getCurrentValue());

		System.out.println(counter);

	}
}
