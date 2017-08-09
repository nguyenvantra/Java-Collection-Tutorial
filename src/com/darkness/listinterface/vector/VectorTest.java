package com.darkness.listinterface.vector;

import java.util.Arrays;
import java.util.Vector;

public class VectorTest {
	public static void main(String[] args) {
		// 1.Vector()
		Vector list1 = new Vector();

		// 2.Vector(int size)
		Vector list2 = new Vector(20);

		// 3.Vector(int size, int incr)
		Vector list3 = new Vector(20, 10);

		// 4.Vector(Collection c)
		Vector dummyList = new Vector(Arrays.asList("Alo", 12, "Darkness"));
		Vector list4 = new Vector(dummyList);
		
		
		/**
		 * Method in Vector
		 */
		Vector v = new Vector();
		
		// 1. boolean add(Object obj)
        v.add("Alo");
        v.add(2);
        v.add("Darkness");
        
        System.out.println(v);
	}
}
