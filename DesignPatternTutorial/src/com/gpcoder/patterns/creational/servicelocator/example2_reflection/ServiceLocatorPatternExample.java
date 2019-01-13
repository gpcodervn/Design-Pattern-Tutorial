package com.gpcoder.patterns.creational.servicelocator.example2_reflection;

import com.gpcoder.patterns.creational.servicelocator.EmailService;
import com.gpcoder.patterns.creational.servicelocator.MessagingService;
import com.gpcoder.patterns.creational.servicelocator.SMSService;

public class ServiceLocatorPatternExample {

	public static void main(String[] args) {
		MessagingService service = ServiceLocator.getService(EmailService.class.getCanonicalName());
		System.out.println(service.getMessageBody());

		MessagingService smsService = ServiceLocator.getService(SMSService.class.getCanonicalName());
		System.out.println(smsService.getMessageBody());

		MessagingService emailService = ServiceLocator.getService(EmailService.class.getCanonicalName());
		System.out.println(emailService.getMessageBody());
	}
}
