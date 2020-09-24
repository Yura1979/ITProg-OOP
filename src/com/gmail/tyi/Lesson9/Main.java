package com.gmail.tyi.Lesson9;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Container<Integer> a = new Container<>(10);
		Container<String> b = new Container<>("Hello, World!");
		
//		Error!!!!
//		a.setElement("Java");
		
		int c = 5 + a.getElement();
		System.out.println(c);
		
		System.out.println(a);
		System.out.println(b);
		
		Container<? extends Number> d = a;
		
		Integer[] arr1 = new Integer[] {4, 0, -2, 8};
		Integer min1 = min(arr1);
		System.out.println(min1);

	}
	public static <E extends Comparable<E>> E min(E[] array) {
		E min = array[0];
		
		for (int i = 0; i < array.length; i++) {
			if (array[i].compareTo(min) < 0) {
				min = array[i];
			}
		}
		return min;
	}

}
