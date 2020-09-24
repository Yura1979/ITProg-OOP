package com.gmail.tyi.Lesson9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1 = new ArrayList<>();
		list1.add("Cat");
		list1.add("Dog");
		list1.add("Fish");

		System.out.println(list1);
		list1.add(1, "Mouse");
		System.out.println(list1);
		String el = list1.get(0);
		System.out.println(el);
		Collections.sort(list1);
		System.out.println(list1);
		for (String element : list1) {
			System.out.println(element);
		}
		System.out.println("-------------------------------");
		Iterator<String> itr = list1.iterator();
		for(;itr.hasNext();) {
			System.out.println(itr.next());
		}
	}

}
