package com.darkness.listinterface.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest {
	public static void main(String[] args) {
		/*
		 * initial array list
		 */
		
		// Constructs an empty list
		ArrayList list1 = new ArrayList();

		// Constructs an empty list with the specified initial capacity.
		ArrayList list2 = new ArrayList(10);

		// Constructs a list containing the elements of the specified
		// collection.
		ArrayList<Integer> list3 = new ArrayList<>();

		ArrayList<String> dummyList = new ArrayList<>(Arrays.asList("Nam", "Minh", "Hoa"));

		// Add element
		dummyList.add("Long");

		// Inserts the specified element at the specified position in this list
		dummyList.add(2, "Phong");

		// Appends all of the elements in the specified collection to the end of this list
		ArrayList<String> testList = new ArrayList<>(Arrays.asList("Thu", "Song", "Ha"));
		dummyList.addAll(testList);

		// Inserts all of the elements in the specified collection into this list, starting at the specified position
		dummyList.addAll(2, testList);
		
		// Removes the element at the specified position in this list.
		dummyList.remove(1);
		
		for (int i = 0; i < dummyList.size(); i++) {
			// Returns the element at the specified position in this list.
			System.out.println(dummyList.get(i));
		}
		
		// clear list
		dummyList.clear();
		
		// Check list empty
		dummyList.isEmpty();

	}
}
