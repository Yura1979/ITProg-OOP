package com.gmail.tyi.Lesson8.HW.Stack;

import java.util.Scanner;

public class TestStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		BlackList blackList = new BlackList(5);
		Stack myStack = new Stack(10, blackList);
		System.out.println(myStack);
		myStack.pop();
		for (int i = 0; i < 10; i++) {
			myStack.push(i);
		}
		
		System.out.println(myStack);
		for (int i = 0; i < 4; i++) {
			System.out.println(myStack.pop());
		}
		System.out.println(myStack);
		System.out.println(myStack.peack());
		
		blackList.addClass("Scanner");
		myStack.push(sc);
		
		System.out.println(myStack);

	}

}
