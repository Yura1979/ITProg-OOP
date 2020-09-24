package com.gmail.tyi.Lesson9.HW;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arrayListTest(generateIntegerList(10));

	}
	public static <E> void arrayListTest(List<E> list) {
		for (int i = 0; i < 2; i++) {
			list.remove(0);
		}
		list.remove(list.size() - 1);
		System.out.println(list);
	}
	public static List<Integer> generateIntegerList(int size) {
		Random rnd = new Random();
		List<Integer> intList = new ArrayList<>(size);
		for (int i = 0; i < size; i++) {
			intList.add(rnd.nextInt(100) + 1);
		}
		System.out.println("Generated list " + intList);
		return intList;
	}

}
