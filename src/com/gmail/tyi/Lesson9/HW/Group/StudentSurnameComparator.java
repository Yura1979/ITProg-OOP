package com.gmail.tyi.Lesson9.HW.Group;

import java.util.Comparator;

public class StudentSurnameComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		if (o1 != null && o2 == null) {
			return 1;
		}
		if (o1 == null && o2 != null) {
			return -1;
		}
		if (o1 == null && o2 == null) {
			return 0;
		}
		
		Student student1 = (Student) o1;
		Student student2 = (Student) o2;
		
		if (student1.getSurname().compareTo(student2.getSurname()) > 0) {
			return 1;
		}
		if (student1.getSurname().compareTo(student2.getSurname()) < 0) {
			return -1;
		}
		
		return 0;
	}

}
