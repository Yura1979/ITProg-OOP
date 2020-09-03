package com.gmail.tyi.Lesson3.HW;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1 = new Student("Vasil", "Pupkin", 23, Gender.MALE);
		Student st2 = new Student("Ivannta", "Arikova", 23, Gender.FEMALE);
		Student st3 = new Student("Petr", "Duhov", 23, Gender.MALE);
		Student st4 = new Student("Ivan", "Paliv", 23, Gender.MALE);
		Student st5 = new Student("Andriy", "Kuronin", 23, Gender.MALE);
		Student st6 = new Student("Andriy", "Teniv", 23, Gender.MALE);
		Student st7 = new Student("Andriy", "Moniv", 23, Gender.MALE);
		Student st8 = new Student("Andriy", "Karin", 23, Gender.MALE);
		Student st9 = new Student("Andriy", "Zhilin", 23, Gender.MALE);
		Student st10 = new Student("Andriy", "Ivaniv", 23, Gender.MALE);
		Student st11 = new Student("Andriy", "Kuziv", 23, Gender.MALE);
		
		Group group = new Group("Group 1");
		
		
		try {
			group.addStudent(st1);
			group.addStudent(st2);
			group.addStudent(st3);
			group.addStudent(st4);
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
		group.findStudent("Arikova");
		group.deleteStudent(st2);
		System.out.println(group);
		group.findStudent("Arikova");
		
		
		
		
	}

}
