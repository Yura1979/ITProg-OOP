package com.gmail.tyi.Lesson1;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		car1.setColor("Green");
		car1.setWeight(2000);
		car1.setYear(1980);
		
		Car car2 = new Car("Red", 1000, 2018);
				
		System.out.println(car1);
		System.out.println();
		System.out.println(car2);
		

	}

}
