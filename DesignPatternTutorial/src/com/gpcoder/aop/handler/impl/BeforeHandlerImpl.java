package com.gpcoder.aop.handler.impl;

import java.lang.reflect.Method;

import com.gpcoder.aop.handler.BeforeHandler;

/**
 * This class provides implementation before actual execution of method.
 */
public class BeforeHandlerImpl extends BeforeHandler {

	@Override
	public void handleBefore(Object proxy, Method method, Object[] args) {
		// Provide your own cross cutting concern
		System.out.println("Handling before actual method execution");
	}
}