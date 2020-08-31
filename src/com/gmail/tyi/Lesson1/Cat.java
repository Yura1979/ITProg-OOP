package com.gmail.tyi.Lesson1;

public class Cat {
	private String alias;
	private String breed;
	private int age;
	
	public Cat(String alias, String breed, int age) {
		super();
		this.alias = alias;
		this.breed = breed;
		this.age = age;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Cat [alias=" + alias + ", breed=" + breed + ", age=" + age + "]";
	}
	
	public void move(String typeOfMove) {
		System.out.println("Cat " + this.alias + " " + typeOfMove);
	}
	
	public void eat() {
		System.out.println("Cat " + this.alias + " eating");
	}
	
	public void sleep() {
		System.out.println("Cat " + this.alias + " sleeping");
	}
	
	public void play() {
		System.out.println("Cat " + this.alias + " playing");
	}

}
