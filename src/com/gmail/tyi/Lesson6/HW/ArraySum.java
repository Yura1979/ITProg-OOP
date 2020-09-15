package com.gmail.tyi.Lesson6.HW;

public class ArraySum implements Runnable {
	
	private int[] array;
	private long sum = 0;
	
	public ArraySum(int[] array) {
		super();
		this.array = array;
	}
	
	
	public long getSum() {
		return sum;
	}

	public long arraySum() {
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		arraySum();
		
	}

}
