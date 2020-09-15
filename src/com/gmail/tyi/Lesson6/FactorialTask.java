package com.gmail.tyi.Lesson6;

import java.math.BigInteger;

public class FactorialTask implements Runnable {

	private int number;
	private BigInteger factSum = new BigInteger("0");

	public FactorialTask(int number) {
		super();
		this.number = number;
	}

	public BigInteger calculateFactorial(int num) {
		BigInteger fact = new BigInteger("1");
		for (int i = 1; i <= num; i++) {
			fact = fact.multiply(new BigInteger("" + i));
		}
		return fact;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread thread = Thread.currentThread();
		
		for (int i = 1; i <= number; i++) {
			BigInteger f = calculateFactorial(i);
			System.out.println(thread.getName() + " => " + i + "!= " + f);
			factSum = factSum.add(f);
		}

	}

	public BigInteger getFactSum() {
		return factSum;
	}

}
