package com.gmail.tyi.Lesson5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileOperation {
	public static void copyFile(File in, File out) throws IOException {
		byte[] buffer = new byte[1_000_000];
		int byteRead = 0;
		try (InputStream is = new FileInputStream(in);
				OutputStream os = new FileOutputStream(out)){
			for(;(byteRead = is.read(buffer)) > 0;) {
				os.write(buffer, 0, byteRead);
			}
			
		} catch (IOException e) {
			throw e;
		}
	}

}
