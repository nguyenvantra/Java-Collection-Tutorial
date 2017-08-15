package com.darkness.setinterface.hashset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	public static void main(String[] args) {
		// 1. HashSet()
		HashSet list1 = new HashSet();

		// 2. HashSet(Collection c)
		ArrayList dummyList = new ArrayList(Arrays.asList("Alo", 3, "Darkness"));
		HashSet list2 = new HashSet(dummyList);

		// 3. HashSet(int initialCapacity)
		HashSet list3 = new HashSet(30);

		// 4.HashSet(int initialCapacity, float loadFactor)
		HashSet list4 = new HashSet(20, 0.9f);

		HashSet<String> h = new HashSet<String>();

		// adding into HashSet
		h.add("India");
		h.add("Australia");
		h.add("South Africa");
		h.add("India");// adding duplicate elements

		// printing HashSet
		System.out.println(h);
		System.out.println("List contains India or not:" + h.contains("India"));

		// Removing an item
		h.remove("Australia");
		System.out.println("List after removing Australia:" + h);

		// Iterating over hash set items
		System.out.println("Iterating over list:");
		Iterator<String> i = h.iterator();
		while (i.hasNext())
			System.out.println(i.next());
	}
}
