package com.gmail.tyi.Lesson8.HW.Stack;

import java.util.Arrays;

public class BlackList {
	
	private int size;
	private String[] blackList;
	
	public BlackList(int size) {
		super();
		this.size = size;
		blackList = new String[size];
	}
	
	public boolean isInBlackList(Object obj) {
		String str = obj.getClass().getSimpleName();
		System.out.println(str);
		
		for (int i = 0; i < blackList.length; i++) {
			if (blackList[i] != null && blackList[i].equals(str)) {
				return true;
			}
		}
		return false;
	}
	
	public void addClass(String className) {
		for (int i = 0; i < blackList.length; i++) {
			if (blackList[i] == null && isNotInBlackList(className)) {
				blackList[i] = className;
				return;
			}
		}
	}
	
	public void removeClass(String className) {
		for (int i = 0; i < blackList.length; i++) {
			if (blackList[i] != null && blackList[i].equals(className)) {
				blackList[i] = null;
				return;
			}
		}
		System.out.println(className + " not in black list");
	}
	

	@Override
	public String toString() {
		return "BlackList [size=" + size + ", blackList=" + Arrays.toString(blackList) + "]";
	}
	
	private boolean isNotInBlackList(String className) {
		for (int i = 0; i < blackList.length; i++) {
			if (blackList[i] == null) {
				continue;
			}
			if (blackList[i].equals(className)) {
				return false;
			}
		}
		return true;
	}
	

}
