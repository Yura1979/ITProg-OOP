package com.gmail.tyi.Lesson5.HW;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;

public class Task2 {
	
	public static void main(String[] args) {
				
		String str1;
		String str2;
		String str3;

		File file1 = new File("D:\\test\\dir1\\test1.txt");
		File file2 = new File("D:\\test\\dir1\\test2.txt");
		File file3 = new File("D:\\test\\dir1\\test3.txt");
		try {
			str1 = readFileToString(file1);
			str2 = readFileToString(file2);
			str3 = findSameWords(str1, str2);
			writeStringToFile(file3, str3);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	public static String findSameWords(String str1, String str2) {
		String[] words1 = str1.split("\\s*,\\s*");
		String[] words2 = str2.split("\\s*,\\s*");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < words1.length; i++) {
			for (int j = 0; j < words2.length; j++) {
				if (words1[i].equals(words2[j])) {
					sb.append(words1[i] + "\n");
				}
			}
		}
		sb.setLength(sb.length() - 1);
		return sb.toString();
	}
	public static void writeStringToFile(File file, String str) throws IOException {
		try (Writer wr = new PrintWriter(file)){
			wr.write(str);
		} catch (Exception e) {
			throw e;
		}
	}
	public static String readFileToString(File file) throws IOException {
		
		try (Reader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr)){
			
			StringBuilder sb = new StringBuilder();
			
			while (br.ready()) {
				sb.append(br.readLine() + "\n");
			}
			sb.setLength(sb.length() - 1);
			return sb.toString();
		} catch (Exception e) {
			throw e;
		}
	}

}
