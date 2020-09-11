package com.gmail.tyi.Lesson5.HW;

import java.io.File;
import java.io.FileFilter;

public class PDFFileFilter implements FileFilter {

	@Override
	public boolean accept(File file) {
		if (file.getName().endsWith(".pdf")) {
			return true;
		}
		return false;
	}

}
