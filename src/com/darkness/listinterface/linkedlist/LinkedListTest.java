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
	}
}
