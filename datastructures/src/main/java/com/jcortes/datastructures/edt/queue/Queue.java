package com.jcortes.datastructures.edt.queue;

public class Queue {

	private int maxSize; // initializes the set number of slots
	private long[] queueArray; // slots to maintain data
	private int front; // this will be the index prosition for the element in
						// the front.
	private int rear; // this will be the index prosition for the element at the
						// back of the line
	private int nItems; // the counter to maintain the number of items in the
						// queue.

	public Queue(int size) {
		this.maxSize = size;
		this.queueArray = new long[size];
		front = 0; // index position of the first slot of the array
		rear = -1; // there's no item the array yet to be considered as the last
					// item.
		nItems = 0; // we don't have element in the queue yet.
	}

	public void insert(long value) {
		if (rear == maxSize - 1) {
			rear = -1;
		}
		rear++;
		queueArray[rear] = value;
		nItems++;
	}

	public long remove() {
		long temp = queueArray[front];
		front++;
		if (front == maxSize) {
			front = 0; // we can set front back the 0th index so that we can
						// utilize the entire array again
		}
		nItems--;
		return temp;
	}

	public long peekFront() {
		return queueArray[front];
	}

	public boolean isEmpty() {
		return (nItems == 0);
	}

	public boolean isFull() {
		return (nItems == maxSize);
	}

	public void view() {
		System.out.print("[ ");
		for (int i = 0; i < queueArray.length; i++) {
			System.out.print(queueArray[i] + " ");

		}
		System.out.println(" ]");
	}
}
