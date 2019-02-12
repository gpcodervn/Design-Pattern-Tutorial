package com.gpcoder.patterns.creational.googleguice.aop.handler;

import com.google.inject.AbstractModule;
import com.google.inject.matcher.Matchers;

public class AOPModule extends AbstractModule {

	@Override
	protected void configure() {
		// Inject interceptor
		LoggingInterceptor loggingInterceptor = new LoggingInterceptor();
		requestInjection(loggingInterceptor);

		// Define a binding for a Matcher
		bindInterceptor(Matchers.any(), Matchers.annotatedWith(Loggable.class), loggingInterceptor);
	}
}