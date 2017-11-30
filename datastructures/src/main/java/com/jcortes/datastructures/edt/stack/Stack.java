package com.jcortes.datastructures.edt.stack;

public class Stack {

	private int maxSize;
	private char[] stackArray;
	private int top;

	public Stack(int size) {
		this.maxSize = size;
		this.stackArray = new char[size];
		this.top = -1;
	}

	public void push(char value) {
		if (isFull()) {
			System.out.println("This stack is already full");
		} else {
			top++;
			stackArray[top] = value;
		}
	}

	public char pop() {
		if (isEmpty()) {
			System.out.println("This stack is already empty");
			return '0';
		} else {
			int oldTop = top;
			top--;
			return stackArray[oldTop];
		}
	}

	public char peak() {
		return stackArray[top];
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (maxSize - 1 == top);
	}

}
