package com.gmail.tyi.Lesson6.HW;

import java.util.Arrays;

public class PopulateArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[10];
		
		PopulateArray populateArray = new PopulateArray(0, 10, array);
		populateArray.generateArray();
		System.out.println(Arrays.toString(array));

	}

}
