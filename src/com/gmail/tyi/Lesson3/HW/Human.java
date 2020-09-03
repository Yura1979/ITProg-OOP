package com.gmail.tyi.Lesson3.HW;

public class Human {
	private String name;
	private String surname;
	int age;
	Gender genger;
	
	public Human(String name, String surname, int age, Gender genger) {
		super();
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.genger = genger;
	}

	public Human() {
		super();
	}

	@Override
	public String toString() {
		return "[name=" + name + ", surname=" + surname + ", age=" + age + ", genger=" + genger + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Gender getGenger() {
		return genger;
	}

	public void setGenger(Gender genger) {
		this.genger = genger;
	}
	
	

}
