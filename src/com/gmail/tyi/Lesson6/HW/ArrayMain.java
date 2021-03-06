package com.gmail.tyi.Lesson6.HW;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = 0;
		long endTime = 0;
		
		
		

//		int arrayLength = 2_000_000;
		int arrayLength = 2_000_000_000;
		
		startTime = System.currentTimeMillis();
//		int[] array = generateArray(arrayLength);
		int[] array = new int[arrayLength];
		int parts = 32;
		generateArrayInThreads(parts, array);

		endTime = System.currentTimeMillis();
		System.out.println("Array generation time: " + (endTime - startTime) / 1000 + "seconds");
		
		startTime = System.currentTimeMillis();	
		ArraySum array1Sum = new ArraySum(array);
		System.out.println(array1Sum.arraySum());
		endTime = System.currentTimeMillis();
		System.out.println("Total execution time: " + (endTime - startTime) + "ms");
		
//		Arrays.copyOfRange(original, from, to);
		parts = 4;
		startTime = System.currentTimeMillis();
		System.out.println(calculateArraySumInThreads(parts, arrayLength, array));
		endTime = System.currentTimeMillis();
		System.out.println("Total execution time with Threads: " + (endTime - startTime) + "ms");
		
		
	}
	
	public static void generateArrayInThreads(int parts, int[] array) {
		int arrayPart = array.length / parts;
		
		PopulateArray[] populateArray = new PopulateArray[parts];
		Thread[] threads = new Thread[parts];
		
		int from = 0;
		int to = arrayPart;
		
		for (int i = 0; i < threads.length; i++) {
			populateArray[i] = new PopulateArray(from, to, array);
			threads[i] = new Thread(populateArray[i]);
			from += arrayPart;
			to += arrayPart;
		}
		for (int i = 0; i < threads.length; i++) {
			threads[i].start();
		}
		
		for (int i = 0; i < threads.length; i++) {
			try {
				threads[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

	public static long calculateArraySumInThreads(int parts, int arrayLength, int[] array) {
		long sum = 0;
		int arrayPart = arrayLength / parts;
		
		ArraySum[] arraySumPart = new ArraySum[parts];
		Thread[] threads = new Thread[parts];
		
		int from = 0;
		int to = arrayPart;
		
		for (int i = 0; i < threads.length; i++) {
			arraySumPart[i] = new ArraySum(array, from, to);
			threads[i] = new Thread(arraySumPart[i]); 
			from += arrayPart;
			to += arrayPart;
		}
		
		for (int i = 0; i < threads.length; i++) {
			threads[i].start();
		}
		
		for (int i = 0; i < threads.length; i++) {
			try {
				threads[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		for (int i = 0; i < arraySumPart.length; i++) {
			sum += arraySumPart[i].getSum();
		}
		return sum;
	}

	public static int[] generateArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length");

		int arrayLength = sc.nextInt();
		int[] array = new int[arrayLength];

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (1 + Math.random() * 100);
		}
		System.out.println("Generated array " + Arrays.toString(array));
		sc.close();

		return array;
	}

	public static int[] generateArray(int arrayLength) {

		int[] array = new int[arrayLength];

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (1 + Math.random() * 100);
		}
		System.out.println("Generated array " + Arrays.toString(array));

		return array;
	}

}
