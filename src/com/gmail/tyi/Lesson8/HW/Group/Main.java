package com.gmail.tyi.Lesson8.HW.Group;

import java.io.File;
import java.util.Arrays;

import com.gmail.tyi.Lesson8.HW.Group.DAO.Data;
import com.gmail.tyi.Lesson8.HW.Group.DAO.MiniDb;
import com.gmail.tyi.Lesson8.HW.Group.DAO.SaveDataToJSON;
import com.gmail.tyi.Lesson8.HW.Group.DAO.SaveObjToFile;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1 = new Student("Vasil", "Pupkin", 17, Gender.MALE);
		Student st2 = new Student("Ivanna", "Arikova", 23, Gender.FEMALE);
		Student st3 = new Student("Petr", "Duhov", 23, Gender.MALE);
		Student st4 = new Student("Ivan", "Paliv", 23, Gender.MALE);
		Student st5 = new Student("Andriy", "Kuronin", 23, Gender.MALE);
		Student st6 = new Student("Andriy", "Teniv", 17, Gender.MALE);
		Student st7 = new Student("Andriy", "Moniv", 23, Gender.MALE);
		Student st8 = new Student("Andriy", "Karin", 17, Gender.MALE);
		Student st9 = new Student("Andriy", "Zhilin", 23, Gender.MALE);
		Student st10 = new Student("Andriy", "Ivaniv", 23, Gender.MALE);
		Student st11 = new Student("Andriy", "Kuziv", 23, Gender.MALE);

		Group group1 = new Group("Group 1");
		Group group2 = new Group("Group 2");
		Group group3 = new Group("Group 3");
		

		try {
			group1.addStudent(st1);
			group1.addStudent(st2);
			group1.addStudent(st3);
			group1.addStudent(st4);
//			group.interactiveAddStudent();
			group2.addStudent(st5);
			group2.addStudent(st5);
			group2.addStudent(st6);
			group2.addStudent(st7);
			group3.addStudent(st8);
			group3.addStudent(st9);
			group3.addStudent(st10);
			group3.addStudent(st11);
		} catch (GroupFullException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(group1);
		System.out.println(group1.findStudent("Arikova"));
		Voencom voencom = group1;
		System.out.println("Призовниками в групі " + group1.getName() + " є " + Arrays.toString(voencom.getRecruter()));
		group1.deleteStudentByID(st2.getRecordBookNum());
		System.out.println(group1);

		File file = new File("D:\\test\\" + group1.getName() + ".json");

		Data dataJson = new SaveDataToJSON();
		dataJson.saveData(group1, file);

		Group group_test = dataJson.loadData(file);
		System.out.println(group_test);
		
		File fileObj = new File("D:\\test\\" + group1.getName() + ".out");
		
		Data dataObj = new SaveObjToFile();
		dataObj.saveData(group1, fileObj);
		
		Group group_test2 = dataObj.loadData(fileObj);
		System.out.println(group_test2);
		
		MiniDb db1 = new MiniDb("Database 1", 5);
		db1.addGroupToDB(group1);
		db1.addGroupToDB(group2);
		db1.addGroupToDB(group3);
		
		File dbFile = new File("D:\\test\\" + db1.getName() + ".out");
		db1.saveDBtoFile(dbFile);
		
		System.out.println(db1);
		
		MiniDb testDb = MiniDb.loadDBfromFile(dbFile);
		System.out.println(testDb);

	}

}
