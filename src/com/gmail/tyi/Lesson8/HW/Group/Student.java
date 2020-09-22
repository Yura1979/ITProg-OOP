package com.gmail.tyi.Lesson8.HW.Group;

import java.io.Serializable;
import java.util.Objects;
import java.util.Random;

public class Student extends Human implements Serializable {
	private int recordBookNum;
	
	
	
	public Student(String name, String surname, int age, Gender genger) {
		super(name, surname, age, genger);
		this.recordBookNum = generateRecordBookNum();
	}

	public Student() {
		super();
	}

	private int generateRecordBookNum() {
		Random rnd = new Random();
		int min = 100000;
		int max = 200000;
		return rnd.nextInt((max - min) + 1) + min;
	}

	public int getRecordBookNum() {
		return recordBookNum;
	}

	public void setRecordBookNum() {
		this.recordBookNum = generateRecordBookNum();
	}

	@Override
	public String toString() {
		return super.toString() + " Record Book Number " + recordBookNum + " ]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(recordBookNum);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		//super.equals(obj);
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return recordBookNum == other.recordBookNum;
	}
	
	

	
	
	

	

	
	
}
