package com.gmail.tyi.Lesson2;

public class Cat extends Animal {
	private String name;
	private String type;
	public Cat(int age, double weigt, boolean sex, String ration, String name, String type) {
		super(age, weigt, sex, ration);
		this.name = name;
		this.type = type;
	}
	
	

}
