package com.gpcoder.patterns.creational.servicelocator.example1;

import java.util.ArrayList;
import java.util.List;

import com.gpcoder.patterns.creational.servicelocator.MessagingService;

public class Cache {

	private static final List<MessagingService> SERVICES = new ArrayList<>();

	public MessagingService getService(String serviceName) {
		for (MessagingService messagingService : SERVICES) {
			if (messagingService.getClass().getSimpleName().equals(serviceName)) {
				return messagingService;
			}
		}
		return null;
	}

	public void addService(MessagingService newService) {
		SERVICES.add(newService);
	}
}
