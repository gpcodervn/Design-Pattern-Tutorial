package com.gpcoder.patterns.creational.googleguice.binding.constant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provides;
import com.google.inject.TypeLiteral;
import com.google.inject.name.Named;
import com.google.inject.name.Names;

class SecondModule extends AbstractModule {
	private final List<String> emails = Arrays.asList("email1", "email2");
	
	@Override
	protected void configure() {
		bind(new TypeLiteral<List<String>>() {}).annotatedWith(Names.named("messages")).toInstance(emails);
	}
	
//	@Provides
//	@Named("messages")
//	public List<String> providesListOfString() {
//		return emails;
//	}
}
class EmailController {
	
	private List<String> messages;
 
    @Inject
    public EmailController(@Named("messages") List<String> messages) {
        this.messages = messages;
    }
 
    public void send() {
        System.out.println(messages);
    }
}
public class GenericTypeConstantAnnotationBindingExample {
	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new SecondModule());
		EmailController emailController = injector.getInstance(EmailController.class);
		emailController.send(); // [email1, email2]
	}
}
