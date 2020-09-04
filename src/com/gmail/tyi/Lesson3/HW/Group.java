package com.gmail.tyi.Lesson3.HW;


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

	private boolean findStudent(Student student) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				continue;
			}
			if (students[i].equals(student)) {
				return true;
			}
		}
		return false;
	}

	public void addStudent(Student student) throws GroupFullException {
		int i;
		if (findStudent(student)) {
			System.out.println(student + "Student already exist");
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

	public void deleteStudentByID(int id) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				continue;
			}
			if (students[i].getRecordBookNum() == id) {
				students[i] = null;
			}
		}
	}

	public Student findStudent(String surname) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null && students[i].getSurname().equals(surname)) {

				return students[i];
			}
		}

		return null;

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
		
		StringBuilder sb = new StringBuilder("Group [name=" + name + ", students=");
		
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				continue;
			}
			sb.append(students[i].toString() + ", ");
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

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

}
