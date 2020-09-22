package com.gmail.tyi.Lesson8.HW.Group.DAO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.gmail.tyi.Lesson8.HW.Group.Group;

public class SaveObjToFile implements Data{

	@Override
	public void saveData(Group obj, File file) {
		// TODO Auto-generated method stub
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
			oos.writeObject(obj);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public Group loadData(File file) {
		// TODO Auto-generated method stub
		Group group = null;
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
			try {
				group = (Group) ois.readObject();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return group;
	}

}
