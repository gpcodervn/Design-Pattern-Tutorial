package com.gpcoder.aop.handler;

import java.lang.reflect.InvocationHandler;

public abstract class AbstractHandler implements InvocationHandler {

	private Object targetObject;
	
	public void setTargetObject(Object targetObject) {
		this.targetObject = targetObject;
	}

	public Object getTargetObject() {
		return targetObject;
	}
}