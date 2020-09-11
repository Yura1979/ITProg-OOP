package com.gmail.tyi.Lesson5.HW;

import java.io.File;
import java.io.FileFilter;

public class MKVFileFilter implements FileFilter {

	@Override
	public boolean accept(File file) {
		if (file.getName().endsWith(".mkv")) {
			return true;
		}
		return false;
	}

}
