package com.gmail.tyi.Lesson1;

public class Phone {
	private Network network;
	private String phoneName;
	private String phoneNumber;
	private boolean isInNetwork = false;

	public Phone() {
		super();
	}

	public Phone(String phoneName, String phoneNumber) {
		super();
		this.phoneName = phoneName;
		this.phoneNumber = phoneNumber;
	}

	public Network getNetwork() {
		return network;
	}

	public void setNetwork(Network network) {
		this.network = network;
	}

	public String getPhoneName() {
		return phoneName;
	}

	public void setPhoneName(String phoneName) {
		this.phoneName = phoneName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void registerInNetwork(Network network) {
		this.network = network;
		this.network.registerPhoneNumber(this.phoneNumber);
		this.isInNetwork = true;
	}

	public void callPhoneNumber(Phone phone) {
		boolean isInNetwork = false;
		if (this.isInNetwork) {
			for (int i = 0; i < this.network.getPhoneNumberIndex(); i++) {
				if (this.network.getPhoneNumbersRegistered()[i].equals(phone.getPhoneNumber())) {
					System.out.println("Calling phone number " + phone.getPhoneNumber());
					isInNetwork = true;
					this.answeringCall(phone);
					break;
				}
				
			}
			if (!isInNetwork) {
				System.out.println("Phone number " + phone.getPhoneNumber() + " not in network");
			}
		} else {
			System.out.println("Phone number " + this.phoneNumber + " not in network");
		}
		

	}
	public void answeringCall(Phone phone) {
		System.out.println(phone.getPhoneNumber() + " answering call from " + this.phoneNumber);
	}

	@Override
	public String toString() {
		return "Phone [network=" + network + ", phoneName=" + phoneName + ", phoneNumber=" + phoneNumber + "]";
	}

}
