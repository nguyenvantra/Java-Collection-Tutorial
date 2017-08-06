package com.darkness.listinterface.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest {
	public static void main(String[] args) {
		// 1.ArrayList()
		ArrayList list1 = new ArrayList<>();

		// 2.ArrayList(Collection c)
		ArrayList<String> dummyList = new ArrayList<>(Arrays.asList("Minh", "Xuan"));
		ArrayList<String> list2 = new ArrayList<>(dummyList);

		// 3.ArrayList(int capacity)
		ArrayList list3 = new ArrayList<>(20);

		/*
		 * All method in ArrayList
		 */
		ArrayList<String> list = new ArrayList<>();
		// 1. boolean add(Object o)
		list.add("Lan");
		list.add("Hoa");
		list.add("Nam");

		// 2. void add(int index, Object element)
		// list.add(1, "Son");

		// 3. boolean addAll(Collection c)
		// list.addAll(dummyList);

		// 4. boolean addAll(int index, Collection c)
		// list.addAll(1, dummyList);

		// 5. void clear()
		// list.clear();

		// 6. Object clone()
		// ArrayList<String> listClone = new ArrayList<>(dummyList.size());
		// listClone = (ArrayList<String>) dummyList.clone();
		// System.out.println(listClone);

		// 7.boolean contains(Object o)
		// list.contains("Darkness");
		// list.contains("Hoa");

		// 8.Object get(int index)
		// list.get(1);

		// 9.Object remove(int index)
		// list.remove(1);

		// 10.int size()
		// list.size();

		// 11.Object[] toArray()
		Object[] ob = list.toArray();
		for (Object value : ob) {
			System.out.println(value);
		}

		System.out.println(list);

	}
}
