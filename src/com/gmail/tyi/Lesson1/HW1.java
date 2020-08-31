package com.gmail.tyi.Lesson1;

public class HW1 {

	public static void main(String[] args) {
		Cat cat1 = new Cat("Murchik", "Bengal", 5);
		Cat cat2 = new Cat("Zola", "Mainkoon", 1);
		
		System.out.println(cat1);
		cat1.move("run");
		cat1.eat();
		cat1.sleep();
		cat1.play();
		
		System.out.println(cat2);
		cat2.sleep();
		cat2.move("walk");
		cat2.eat();
		cat2.play();

	}

}
