package com.gmail.tyi.Lesson1;

public class HW4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Network vodafone = new Network("Vodafone");
		Phone phone1 = new Phone("Samsung Galaxy Note 9", "+380504568923");
		Phone phone2 = new Phone("iPhone 6", "+380501234565");
		phone1.registerInNetwork(vodafone);
		phone1.callPhoneNumber(phone2);
		phone2.registerInNetwork(vodafone);
		phone1.callPhoneNumber(phone2);
		System.out.println(vodafone);
		
	}

}
