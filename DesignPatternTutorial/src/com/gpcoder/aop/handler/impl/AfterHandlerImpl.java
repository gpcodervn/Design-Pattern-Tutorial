package com.gpcoder.aop.handler.impl;

import java.lang.reflect.Method;

import com.gpcoder.aop.handler.AfterHandler;

/**
 * This class provides an implementation of business logic which will be
 * executed after the actual method execution.
 */
public class AfterHandlerImpl extends AfterHandler {

	@Override
	public void handleAfter(Object proxy, Method method, Object[] args) {
		// Provide your own cross cutting concern
		System.out.println("Handling after actual method execution");
		System.out.println("---");
	}
}