package com.gmail.tyi.Lesson3.HW;

import java.util.Arrays;

public class Group {
	private String name;
	private Student[] students = new Student[10];

	public Group(String name) {
		super();
		this.name = name;
	}

	public Group() {
		super();
	}

	public void addStudent(Student student) throws GroupFullException {
		int i;
		if (findStudent(student.getSurname()) > -1) {
			System.out.println("Student already exist");
			return;
		}
		for (i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = student;
				break;
			}
		}
		if (i == students.length) {
			throw new GroupFullException("Group is full!!!");
		}

	}

	public void deleteStudent(Student student) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				continue;
			}
			if (students[i].equals(student)) {
				students[i] = null;
			}
		}
	}

	public void deleteStudentBySurname(String surname) {
		int index = findStudent(surname);
		if (index > -1) {
			students[index] = null;
		}
	}

	public int findStudent(String surname) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null && students[i].getSurname().equals(surname)) {
				
				return i;
			}
		}
		
		return -1;

	}

	private void sortStudents() {
		Student copy;
		for (int i = 0; i < students.length; i++) {
			for (int j = 0; j < students.length; j++) {
				if (students[i] == null || students[j] == null) {
					continue;
				}
				if (students[i].getSurname().compareTo(students[j].getSurname()) < 0) {
					copy = students[i];
					students[i] = students[j];
					students[j] = copy;
				}
			}

		}

	}

	@Override
	public String toString() {
		sortStudents();

		return "Group [name=" + name + ", students=" + Arrays.toString(students) + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

}
