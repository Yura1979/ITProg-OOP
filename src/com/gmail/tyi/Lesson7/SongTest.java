package com.gmail.tyi.Lesson7;

public class SongTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintText prt = new PrintText();
		Song song1 = new Song("Hop", prt);
		Song song2 = new Song("Hey", prt);
		Song song3 = new Song("La-la-ley", prt);
		
		Thread thread1 = new Thread(song1);
		Thread thread2 = new Thread(song2);
		Thread thread3 = new Thread(song3);
		
		prt.registerThread(new Thread[] {thread1, thread2, thread3});
		
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
