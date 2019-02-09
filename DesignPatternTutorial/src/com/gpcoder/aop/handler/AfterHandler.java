package com.gpcoder.aop.handler;

import java.lang.reflect.Method;

public abstract class AfterHandler extends AbstractHandler {

	/**
	 * Handles after the execution of method.
	 */
	public abstract void handleAfter(Object proxy, Method method, Object[] args);

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = method.invoke(getTargetObject(), args);
		handleAfter(proxy, method, args);
		return result;
	}
}