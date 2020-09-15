package com.gmail.tyi.Lesson6.HW;

import java.math.BigInteger;

public class FactorialTask implements Runnable {

	private long number;
	private BigInteger factSum = new BigInteger("0");

	public FactorialTask(long number) {
		super();
		this.number = number;
	}
	
	

	public FactorialTask() {
		super();
	}



	public void setNumber(long number) {
		this.number = number;
	}

	public BigInteger calculateFactorial(long num) {
		if (num == 0) {
			return new BigInteger("1");
		}
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
		BigInteger f = new BigInteger("0");
		
		for (int i = 1; i <= number; i++) {
			f = calculateFactorial(i);
//			System.out.println(thread.getName() + " => " + i + "!= " + f);
			factSum = factSum.add(f);
		}
		System.out.println(thread.getName() + " => " + number + "!= " + f);

	}

	public BigInteger getFactSum() {
		return factSum;
	}

}
