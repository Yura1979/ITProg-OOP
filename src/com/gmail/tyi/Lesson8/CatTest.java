package com.gmail.tyi.Lesson8;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class CatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat1 = new Cat("Vaska", 4);
		Cat cat2 = new Cat("Vaska", 4);
		
		System.out.println(cat1.hashCode());
		System.out.println(cat2.hashCode());
		
		System.out.println(cat1.equals(cat2));
		System.out.println("--------------------------");
		
		Cat cat3;
		try {
			cat3 = cat1.clone();
			System.out.println(cat3);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Class catClass = Cat.class;
		System.out.println(catClass);
		
		Field[] fields = catClass.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field);
		}
		System.out.println("--------------------------");
		Method[] methods = catClass.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println(method);
		}
		System.out.println("--------------------------");
		Class[] interfaces = catClass.getInterfaces();
		for (Class classInterface : interfaces) {
			System.out.println(classInterface);
			if (classInterface.equals(Cloneable.class)) {
				System.out.println("Cat clonable ON");
			}
		}
		System.out.println("--------------------------");
	
		try {
			Field catAge = catClass.getDeclaredField("age");
			catAge.setAccessible(true);
			catAge.setInt(cat1, 100500);
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(cat1);
		

	}

}
