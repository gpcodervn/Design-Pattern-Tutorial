package com.gpcoder.patterns.creational.dependencyinjection.ioc;

import javax.management.InstanceNotFoundException;

import com.gpcoder.patterns.creational.dependencyinjection.di.MessageService;
import com.gpcoder.patterns.creational.dependencyinjection.di.UserController;

public class DependencyInjectionPatternExample {

	public static void main(String[] args) throws InstanceNotFoundException {

		MessageService messageService = (MessageService) Injector.getInstance("messageService");
		UserController userController = new UserController(messageService);
		userController.send();
	}
}
