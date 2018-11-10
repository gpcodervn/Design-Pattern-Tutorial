package com.gpcoder.patterns.structural.facade;

public class SmsService {

	public void sendSMS(String mobilePhone) {
		System.out.println("Sending an mesage to " + mobilePhone);
	}
}
