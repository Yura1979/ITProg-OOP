package com.gmail.tyi.Lesson4;

import java.util.Comparator;

public class CatNameComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		if (o1 != null && o2 == null) {
			return 1;
		}
		if (o1 == null && o2 != null) {
			return -1;
		}
		if (o1 == null && o2 == null) {
			return 0;
		}

		Cat cat1 = (Cat) o1;
		Cat cat2 = (Cat) o2;

		String name1 = cat1.getName();
		String name2 = cat2.getName();

		if (name1.compareTo(name2) > 0) {
			return 1;
		}
		if (name1.compareTo(name2) < 0) {
			return -1;
		}

		return 0;
	}

}