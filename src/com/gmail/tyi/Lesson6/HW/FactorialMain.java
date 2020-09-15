package com.gmail.tyi.Lesson6.HW;

public class FactorialMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactorialTask[] factorialTasks = new FactorialTask[100];
		Thread[] myThreads = new Thread[100];
		
		for (int i = 0; i < myThreads.length; i++) {
			factorialTasks[i] = new FactorialTask();
			myThreads[i] = new Thread(factorialTasks[i]);
			factorialTasks[i].setNumber(myThreads[i].getId());
			System.out.println(myThreads[i].getId());
		}
		
		for (int i = 0; i < myThreads.length; i++) {
			myThreads[i].start();
		}

	}

}
