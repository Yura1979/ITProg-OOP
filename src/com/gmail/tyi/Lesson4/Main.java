package com.gmail.tyi.Lesson4;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cat cat1 = new Cat("Murka", "White", 4);
//		Cat cat2 = new Cat("Kuzya", "Purple", 2);
		Cat cat2 = null;;
		Cat cat3 = new Cat("Kleo", "White", 8);
		Cat cat4 = new Cat("Markiz", "Red", 3);
		Cat cat5 = new Cat("Barsik", "Black", 1);
		
		Cat[] cats = {cat1, cat2, cat3, cat4, cat5};
		
		for (Cat cat : cats) {
			System.out.println(cat);
		}
		System.out.println();
		
		Arrays.sort(cats, new CatAgeComparator());
		
		for (Cat cat : cats) {
			System.out.println(cat);
		}

	}

}
