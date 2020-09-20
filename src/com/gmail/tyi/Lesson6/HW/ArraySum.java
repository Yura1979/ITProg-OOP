package com.gmail.tyi.Lesson6.HW;

public class ArraySum implements Runnable {
	
	private int[] array;
	private long sum = 0;
	
	private int startIndex;
	private int stopIndex;
	
	public ArraySum(int[] array) {
		super();
		this.array = array;
	}
	
	
	
	
	public ArraySum(int[] array, int startIndex, int stopIndex) {
		super();
		this.array = array;
		this.startIndex = startIndex;
		this.stopIndex = stopIndex;
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
	
	public long arraySumByIndex() {
		
		for (int i = startIndex; i < stopIndex; i++) {
			sum += array[i];
		}
		return sum;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		arraySumByIndex();
		
	}

}
