package com.gmail.tyi.Lesson3;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new B();
		a.sum(2);
		System.out.println(a.num);

	}

}

class A {
	protected int num = 3;
	public void sum(int n) {
		num += n;
	}
}

class B extends A {
	protected int num = 5;
	
	@Override
	public void sum(int n) {
		num *= n;
	}
}
