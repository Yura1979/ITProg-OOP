package com.gmail.tyi.Lesson10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] nameArray = new String[] { "Anna", "Ira", "Sergey", "Anton" };

		List<String> names = new ArrayList<>();
		for (int i = 0; i < 16; i++) {
			names.add(nameArray[(int) (Math.random() * nameArray.length)]);
		}
		System.out.println(names);

		Map<String, Integer> stat = new HashMap<>();

		for (String name : names) {
			Integer n = stat.get(name);
			if (n == null) {
				stat.put(name, 1);
			} else {
				stat.put(name, n + 1);
			}
		}
		System.out.println(stat);

	}

}
