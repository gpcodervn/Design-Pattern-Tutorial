package com.gpcoder.patterns.creational.googleguice.aop.handler;

import java.util.logging.Logger;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import com.google.inject.Inject;

/**
 * Implement the AOP Alliance's MethodInterceptor
 */
public class LoggingInterceptor implements MethodInterceptor {

	@Inject
	private Logger logger;

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		logger.info("LoggingInterceptor");
		
		// Handle before
		System.out.println("Handling before actual method execution");
		
		// Inspect the call: the method, its arguments
		System.out.println("Gets the method being called: " + invocation.getMethod().getName());
		Object[] objectArray = invocation.getArguments();
		for (Object object : objectArray) {
			System.out.println("Get the arguments: " + object);
		}
		
		// Proceeds to the next interceptor in the chain. 
		Object result = invocation.proceed();
		
		// Handle after
		System.out.println("Handling after actual method execution");
		System.out.println("---");
		
		return result;
	}
}