package com.gmail.tyi.Lesson3.HW;

import java.util.Random;

public class Student extends Human {
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
		return super.toString() + " Record Book Number" + recordBookNum + " ]";
	}

	

	
	
}
