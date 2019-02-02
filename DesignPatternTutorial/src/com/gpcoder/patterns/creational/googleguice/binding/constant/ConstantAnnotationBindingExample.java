package com.gpcoder.patterns.creational.googleguice.binding.constant;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.name.Named;
import com.google.inject.name.Names;

class FirstModule extends AbstractModule {
	@Override
	protected void configure() {
		bind(String.class).annotatedWith(Names.named("message")).toInstance("Hello constant bindings");
	}
}
class UserController {
	
	private String message;
 
    @Inject
    public UserController(@Named("message") String message) {
        this.message = message;
    }
 
    public void send() {
        System.out.println(message);
    }
}
public class ConstantAnnotationBindingExample {
	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new FirstModule());
		UserController userController = injector.getInstance(UserController.class);
		userController.send(); // Hello constant bindings
	}
}
