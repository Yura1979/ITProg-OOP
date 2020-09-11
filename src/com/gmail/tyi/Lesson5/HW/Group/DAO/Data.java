package com.gmail.tyi.Lesson5.HW.Group.DAO;

import java.io.File;

import com.gmail.tyi.Lesson5.HW.Group.Group;

public interface Data {
	void saveData(Group obj, File file);
	Group loadData(File file);

}
