package com.gmail.tyi.Lesson10;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> map1 = new HashMap<>();
		
		map1.put(1, "one");
		map1.put(10, "ten");
		map1.put(2, "two");
		map1.put(5, "five");
		System.out.println(map1);
		
		String text = map1.get(1);
		System.out.println(text);
		
		map1.put(1, "ONE");
		System.out.println(map1);
		
		Set<Integer> keys = map1.keySet();
		
		for (Integer key : keys) {
			System.out.println(key + " => " + map1.get(key));
		}
		
		Set<Integer> set1 = new HashSet<>();
		

	}

}
