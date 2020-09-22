package com.gmail.tyi.Lesson8.HW.Stack;

import java.util.Arrays;

public class Stack {
	
	private int size;
	private int headIndex = -1;
	private Object[] stack;
	private BlackList blackList;
	
	public Stack(int size, BlackList blackList) {
		super();
		this.size = size;
		stack = new Object[size];
		this.blackList = blackList;
	}
	
	public void push(Object obj) {
		if (headIndex >= -1 && headIndex < size) {
			if (blackList.isInBlackList(obj)) {
				System.out.println("Class in black list, operation not permitted");
				return;
			}
			stack[++headIndex] = obj;
		} else {
			System.out.println("Stack full!!!");
		}
	}
	
	public Object pop() {
		if (isEmpty()) {
			return null;
		}
		return stack[headIndex--];
	}
	
	public Object peack() {
		if (isEmpty()) {
			return null;
		}
		return stack[headIndex];
	}
	
	private boolean isEmpty() {
		if (headIndex == -1) {
			System.out.println("Stack empty");
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		if (isEmpty()) {
			return "Stack [size=" + size + " is empty]";
		}
		StringBuilder sb = new StringBuilder("Stack [size=" + size + ", headIndex=" + headIndex + ", stack=");
		for (int i = 0; i <= headIndex; i++) {
			sb.append(stack[i] + ", ");
		}
		
		sb.setLength(sb.length() - 2);
		sb.append("]");
		
		return sb.toString();
	}
	
	

}
