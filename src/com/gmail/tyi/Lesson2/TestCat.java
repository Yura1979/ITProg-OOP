package com.gmail.tyi.Lesson2;

public class TestCat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat = new Cat(4, 6, true, "Milk", "Barsik", "Home cat");
		System.out.println(cat.getAge());
		
		System.out.println(cat.hashCode());
		cat.getVoice();
		System.out.println(cat);
		
		Animal an = null;
		
		an = cat;
		an.getVoice();
		
		Animal[] zoo = new Animal[10];
		zoo[0] = cat;
		System.out.println(an instanceof Cat);

	}

}
