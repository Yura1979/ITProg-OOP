package com.gmail.tyi.Lesson6.HW;

public class PopulateArray implements Runnable {
	private int startIndex;
	private int endIndex;
	private int[] array;

	public PopulateArray(int startIndex, int endIndex, int[] array) {
		super();
		this.startIndex = startIndex;
		this.endIndex = endIndex;
		this.array = array;
	}

	public void generateArray() {
		for (int i = startIndex; i < endIndex; i++) {
			array[i] = (int) (1 + Math.random() * 100);
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		generateArray();

	}

}
