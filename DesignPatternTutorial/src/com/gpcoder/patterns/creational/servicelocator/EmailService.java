package com.gpcoder.patterns.creational.servicelocator;

public class EmailService implements MessagingService {

	public String getMessageBody() {
		return "This is message body of Email message";
	}

	public String getServiceName() {
		return "EmailService";
	}
}