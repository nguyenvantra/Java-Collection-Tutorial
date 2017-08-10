package com.darkness.listinterface.linkedlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListTest {
	public static void main(String[] args) {
		// 1. LinkedList()
		LinkedList list1 = new LinkedList();

		// 2. LinkedList(Collection c)
		ArrayList dummyList = new ArrayList(Arrays.asList("Alo", 2, "Darkness"));
		LinkedList list2 = new LinkedList<>(dummyList);

		/**
		 * Method
		 */
		LinkedList list = new LinkedList<>();
		list.add("Alo");
		//list.add(0, 2);
		//list.addFirst("Hello");
		list.add(23);
		//list.addLast("Hello");
		//list.get(0);
		//list.contains("Alo"); // true
		list.size();
		System.out.println(list);
//		list.remove(0);
//		System.out.println(list);
		
		
		
	}
}
