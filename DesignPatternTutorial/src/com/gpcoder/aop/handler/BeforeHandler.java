package com.gpcoder.aop.handler;

import java.lang.reflect.Method;

/**
 * The class BeforeHandler provides a template for the before execution
 */
public abstract class BeforeHandler extends AbstractHandler {

	/**
	 * Handles before execution of actual method.
	 */
	public abstract void handleBefore(Object proxy, Method method, Object[] args);

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.reflect.InvocationHandler#invoke(java.lang.Object,
	 * java.lang.reflect.Method, java.lang.Object[])
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		handleBefore(proxy, method, args);
		return method.invoke(getTargetObject(), args);
	}
}