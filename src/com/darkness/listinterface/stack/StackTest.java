package com.darkness.listinterface.stack;

import java.util.Stack;

public class StackTest {
	public static void main(String[] args) {
		Stack list = new Stack();

		list.push("Alo");
		list.push(2);

		// System.out.println("Is stack empty: " + list.empty());
		// System.out.println("Top object is: " + list.peek());
		// System.out.println("Removed object is: " + list.pop());
		// System.out.println("Elements after remove: " + list);
		// System.out.println("Elements in the stack: "+list);
		System.out.println("Searching 'code' in stack: "+list.search("Alo"));
		System.out.println("Searching 'code' in stack: "+list.search("Darkness"));
	}
}
