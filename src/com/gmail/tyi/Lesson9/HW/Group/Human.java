package com.gmail.tyi.Lesson9.HW.Group;

import java.io.Serializable;

public class Human implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String surname;
	private int age;
	private Gender genger;
	
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((genger == null) ? 0 : genger.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Human other = (Human) obj;
		if (age != other.age)
			return false;
		if (genger != other.genger)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}
	
	
	

}
