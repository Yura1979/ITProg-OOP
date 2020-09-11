package com.gmail.tyi.Lesson5.HW;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {

	public static void fileCopy(File file1, File file2) throws IOException {
		try (InputStream is = new BufferedInputStream(new FileInputStream(file1));
				OutputStream os = new BufferedOutputStream(
						new FileOutputStream(file2.getAbsolutePath() + "\\" + file1.getName()))) {
			byte[] buffer = is.readAllBytes();
			os.write(buffer);
		} catch (Exception e) {
			throw e;
		}

	}

	public static void fileCopy2(File file1, File file2) throws IOException {
		try (InputStream is = new BufferedInputStream(new FileInputStream(file1));
				OutputStream os = new BufferedOutputStream(
						new FileOutputStream(file2.getAbsolutePath() + "\\" + file1.getName()))) {
			byte[] buffer = new byte[1_000_000_000];
			while (is.available() > 0) {
				is.read(buffer);
				os.write(buffer);
			}
		} catch (Exception e) {
			throw e;
		}

	}

}
