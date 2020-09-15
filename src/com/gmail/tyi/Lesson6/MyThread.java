package com.gmail.tyi.Lesson6;

import java.io.Console;

public class MyThread {
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		
		System.out.println(mainThread.getName() + " start");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FactorialTask task1 = new FactorialTask(10);
		FactorialTask task2 = new FactorialTask(10);
		FactorialTask task3 = new FactorialTask(10);
		
		Thread thread1 = new Thread(task1);	
		Thread thread2 = new Thread(task2);
		Thread thread3 = new Thread(task3);
		
		
		thread1.start();
		thread2.start();
		thread3.start();
		
//		try {
//			thread1.join();
//			thread2.join();
//			thread3.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		thread1.interrupt();
		thread2.interrupt();
		thread3.interrupt();
		
		System.out.println("Sum 1 = " + task1.getFactSum());
		System.out.println("Sum 2 = " + task2.getFactSum());
		System.out.println("Sum 3 = " + task3.getFactSum());
		
		
		System.out.println(mainThread.getName() + " ends");
		System.out.println(mainThread.getId());
	}
	

}
