package com.jcortes.datastructures.edt.stack;

public class App {

	/*public static void main(String[] args) {
		String word = "hello";
		String reversed = reverseString(word);
		System.out.println(reversed);

	}*/

	public static String reverseString(String value) {
		Stack stack = new Stack(value.length());
		for (int i = 0; i < value.length(); i++) {
			stack.push(value.charAt(i));
		}
		String reversed = "";
		while (!stack.isEmpty()) {
			reversed += stack.pop();
		}
		return reversed;
	}

}
