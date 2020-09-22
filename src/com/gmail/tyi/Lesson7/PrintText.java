package com.gmail.tyi.Lesson7;

public class PrintText {

	private long[] threadId = new long[3];
	private int index = 0;

	public synchronized void printText(String text) {
		Thread thr = Thread.currentThread();
		long id = thr.getId();
		for (; id != threadId[index];) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.print(text + " ");
		index = (index + 1) % threadId.length;
		System.out.println(index);
		notifyAll();

	}

	public void registerThread(Thread[] threads) {
		threadId = new long[threads.length];
		for (int i = 0; i < threads.length; i++) {
			threadId[i] = threads[i].getId();
		}
	}

}
