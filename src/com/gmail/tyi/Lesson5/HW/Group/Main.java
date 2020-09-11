package com.gmail.tyi.Lesson5.HW.Group;

import java.io.File;
import java.util.Arrays;

import com.gmail.tyi.Lesson5.HW.Group.DAO.Data;
import com.gmail.tyi.Lesson5.HW.Group.DAO.SaveDataToJSON;

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
	
		
		Group group = new Group("Group 1");
		
		
		try {
			group.addStudent(st1);
			group.addStudent(st2);
			group.addStudent(st3);
			group.addStudent(st4);
			group.interactiveAddStudent();
			group.addStudent(st5);
			group.addStudent(st5);
			group.addStudent(st6);
			group.addStudent(st7);
			group.addStudent(st8);
			group.addStudent(st9);
			group.addStudent(st10);
			group.addStudent(st11);
		} catch (GroupFullException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(group);
		System.out.println(group.findStudent("Arikova"));
		Voencom voencom = group;
		System.out.println("Призовниками в групі " + group.getName() + " є " + Arrays.toString(voencom.getRecruter()));
		group.deleteStudentByID(st2.getRecordBookNum());
		System.out.println(group);
		
		File file = new File("D:\\test\\" + group.getName() + ".json");
		
		Data dataJson = new SaveDataToJSON();
		dataJson.saveData(group, file);
		
		Group group_test = dataJson.loadData(file); 
		System.out.println(group_test);
		
		
		
		
		
		
		
		
		
		
	}

}
