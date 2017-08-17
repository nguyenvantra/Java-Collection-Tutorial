package com.darkness.setinterface.linkedhashset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class LinkedHashSetTest {
	public static void main(String[] args) {
		// 1. LinkedHashSet()
		LinkedHashSet list1 = new LinkedHashSet();

		// 2. LinkedHashSet(Collection c)
		ArrayList dummyList = new ArrayList(Arrays.asList("Alo", 3, "Darkness"));
		LinkedHashSet list2 = new LinkedHashSet(dummyList);

		// 3. LinkedHashSet(int initialCapacity)
		LinkedHashSet list3 = new LinkedHashSet(30);

		// 4.LinkedHashSet(int initialCapacity, float loadFactor)
		LinkedHashSet list4 = new LinkedHashSet(20, 0.9f);
	}
}
