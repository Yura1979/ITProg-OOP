package com.gmail.tyi.test;

import java.util.Arrays;

public class TestSort {

	public static void main(String[] args) {
		int[] array = new int[] {56, 34, 5, 7, 10, 1};
		sortArray(array);
		System.out.println(Arrays.toString(array));

	}
	
	public static void sortArray(int[] array) {
		int tmp = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i] < array[j]) {
					tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(array));
	}

}
