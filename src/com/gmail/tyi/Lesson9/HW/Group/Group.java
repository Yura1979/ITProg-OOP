package com.gmail.tyi.Lesson9.HW.Group;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Group implements Voencom, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
//	private Student[] students = new Student[10];
	private List<Student> students = new ArrayList<>(10);

	public Group(String name) {
		super();
		this.name = name;
	}

	public Group() {
		super();
	}

	private boolean findStudent(Student student) {
		return students.contains(student);
	}
	
	public void interactiveAddStudent() throws GroupFullException {
//		int counter = 0;
//		for (Student student : students) {
//			if (student != null) {
//				counter++;
//			}
//		}
//		if (counter == students.length) {
//			throw new GroupFullException("Group is full!!!");
//		}
		
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		student.setRecordBookNum();
		System.out.println("Please enter student Name: ");
		student.setName(sc.nextLine());
		System.out.println("Please enter student Surname: ");
		student.setSurname(sc.nextLine());
		System.out.println("Please enter student gender in format male or female: ");
		String gender = sc.nextLine();
		System.out.println("Please enter student age: ");
		student.setAge(sc.nextInt());
		
		sc.close();
		
		if (gender.toLowerCase().equals("male")) {
			student.setGenger(Gender.MALE);
		} else if (gender.toLowerCase().equals("female")) {
			student.setGenger(Gender.FEMALE);
		} else {
			throw new IllegalArgumentException("Wrong gender format");
		}
		
		
		addStudent(student);
	}

	public void addStudent(Student student) throws GroupFullException {
		if (students.size() == 10) {
			throw new GroupFullException("Group is full!!!");
		}
		if (findStudent(student)) {
			System.out.println(student + "Student already exist");
			return;
		}
		students.add(student);

	}

	public void deleteStudent(Student student) {
		if (findStudent(student)) {
			students.remove(student);
		} else {
			System.out.println("Nothing to delete, student not found!");
		}
	}

	public void deleteStudentByID(int id) {
		for (int i = 0; i < students.size(); i++) {
			
			if (students.get(i).getRecordBookNum() == id) {
				students.remove(i);
				break;
			}
		}
		System.out.println("Nothing to delete, student not found!");
	}

	public Student findStudent(String surname) {
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getSurname().equals(surname)) {

				return students.get(i);
			}
		}

		return null;

	}

	public void sortStudentsBySurname() {
		Collections.sort(students, new StudentSurnameComparator());
	}


	@Override
	public String toString() {
		// sortStudents();
		sortStudentsBySurname();

		return getName() + " " + students.toString();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public Student[] getRecruter() {
		int counter = 0;
		for (Student student : students) {
			if (student != null && student.getAge() >= 18 && student.getGenger() == Gender.MALE) {
				counter++;
			}
		}
		Student[] recruters = new Student[counter];
		int index = 0;
		for (Student student : students) {
			if (student != null && student.getAge() >= 18 && student.getGenger() == Gender.MALE ) {
				recruters[index++] = student;
			}
		}
		return recruters;
	}

}
