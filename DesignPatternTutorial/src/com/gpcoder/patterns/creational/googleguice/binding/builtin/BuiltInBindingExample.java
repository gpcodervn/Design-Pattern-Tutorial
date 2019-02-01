package com.gpcoder.patterns.creational.googleguice.binding.builtin;

import java.util.logging.Logger;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

class UserController {
	@Inject
	private Logger logger;

	public void log(String message) {
		logger.info(message);
	}
}
public class BuiltInBindingExample {
	public static void main(String[] args) {
		Injector injector = Guice.createInjector();
		UserController userController = injector.getInstance(UserController.class);
		userController.log("Hello built-in bindings"); // INFO: Hello built-in bindings
	}
}
