package com.gmail.tyi.Lesson8.HW.Group.DAO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;

import com.gmail.tyi.Lesson8.HW.Group.Group;

public class MiniDb implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private Group[] database;
	private int dbSize;
		
	public MiniDb() {
		super();
	}

	public MiniDb(String name, int dbSize) {
		super();
		this.name = name;
		this.dbSize = dbSize;
		database = new Group[dbSize];
	}
	
	public void addGroupToDB(Group group) {
		for (int i = 0; i < database.length; i++) {
			if (database[i] == null) {
				database[i] = group;
				return;
			}
			if (i == database.length) {
				System.out.println("Database full!");
			}
		}
	}
	
	
	
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder("MiniDb [name=" + name + ", dbSize=" + dbSize + ", database=");
		
		for (int i = 0; i < database.length; i++) {
			if (database[i] == null) {
				continue;
			}
			sb.append(database[i] + ", ");
		}
		sb.setLength(sb.length() - 2);
		sb.append("]");
		
		return sb.toString();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Group[] getDatabase() {
		return database;
	}

	public void setDatabase(Group[] database) {
		this.database = database;
	}

	public int getDbSize() {
		return dbSize;
	}

	public void setDbSize(int dbSize) {
		this.dbSize = dbSize;
	}

	public void saveDBtoFile(File file) {
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
			oos.writeObject(this);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static MiniDb loadDBfromFile(File file) {
		
		MiniDb db = null;
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
			try {
				db = (MiniDb) ois.readObject();
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
		return db;
	}

}
