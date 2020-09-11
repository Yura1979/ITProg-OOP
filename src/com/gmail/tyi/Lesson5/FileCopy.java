package com.gmail.tyi.Lesson5;

import java.io.File;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File in = new File("D:\\Cloud\\Dropbox\\Privet\\docs\\Java\\Java OOP (All cource).pdf");
		File out = new File("Copy.pdf");
		
		try {
			FileOperation.copyFile(in, out);
			
		} catch (IOException e) {
			// TODO: handle exception
		}

	}

}
