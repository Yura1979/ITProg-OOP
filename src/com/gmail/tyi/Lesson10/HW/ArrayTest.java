package com.gmail.tyi.Lesson10.HW;

import java.util.HashMap;
import java.util.Map;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = { 1, 20, -2, 1, 21, 5, 8, 9, 20, -2, 5 };

		Map<Integer, Integer> stat = new HashMap<>();

		for (int num : intArray) {
			Integer n = stat.get(num);
			if (n == null) {
				stat.put(num, 1);
			} else {
				stat.put(num, n + 1);
			}
		}
		
		System.out.println(stat);

	}

}
