package com.gmail.tyi.Lesson5.HW;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;


public class FileOperation  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File dir1 = new File("D:\\test\\dir1\\");
		File dir2 = new File("D:\\test\\dir2\\");
		
		//FileFilter pdfFileFilter = new PDFFileFilter();
		FileFilter mkvFileFilter = new MKVFileFilter();
		
		if (dir1.isDirectory() && dir2.isDirectory()) {
			File[] files = dir1.listFiles(mkvFileFilter);
			for (File file : files) {
				try {
					if (file.length() < 2_000_000_000) {
						FileCopy.fileCopy(file, dir2);
					} else {
						FileCopy.fileCopy2(file, dir2);
					}
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

}
