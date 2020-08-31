package com.gmail.tyi.Lesson1;

import java.util.Arrays;

public class Network {
	private String cellName;
	private String[] phoneNumbersRegistered = new String[100];
	private int phoneNumberIndex = 0;
	
	
	
	public Network() {
		super();
	}

	public Network(String cellName) {
		super();
		this.cellName = cellName;
	}

	public String getCellName() {
		return cellName;
	}

	public void setCellName(String cellName) {
		this.cellName = cellName;
	}
	
	
	
	public String[] getPhoneNumbersRegistered() {
		return phoneNumbersRegistered;
	}

	public int getPhoneNumberIndex() {
		return phoneNumberIndex;
	}

	public void registerPhoneNumber(String phoneNumber) {
		this.phoneNumbersRegistered[this.phoneNumberIndex++] = phoneNumber;
	}

	@Override
	public String toString() {
		return "Network [cellName=" + cellName + ", phoneNumbersRegistered=" + Arrays.toString(phoneNumbersRegistered)
				+ ", registered phone numbers is " + phoneNumberIndex + "]";
	}
	
	


	

}
