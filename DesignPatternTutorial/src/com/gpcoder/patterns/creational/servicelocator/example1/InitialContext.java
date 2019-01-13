package com.gpcoder.patterns.creational.servicelocator.example1;

import com.gpcoder.patterns.creational.servicelocator.EmailService;
import com.gpcoder.patterns.creational.servicelocator.MessagingService;
import com.gpcoder.patterns.creational.servicelocator.SMSService;

public class InitialContext {

	public MessagingService lookup(String serviceName) {
		if (serviceName.equalsIgnoreCase("EmailService")) {
			return new EmailService();
		} else if (serviceName.equalsIgnoreCase("SMSService")) {
			return new SMSService();
		}
		return null;
	}
}
