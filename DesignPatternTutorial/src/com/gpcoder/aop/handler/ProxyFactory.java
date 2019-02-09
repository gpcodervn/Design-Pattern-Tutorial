package com.gpcoder.aop.handler;

import java.lang.reflect.Proxy;
import java.util.List;

/**
 * A factory for creating Proxy objects.
 */
public class ProxyFactory {
	
	private ProxyFactory() {
		throw new UnsupportedOperationException();
	}

	public static Object getProxy(Object targetObject, List<AbstractHandler> handlers) {
		if (handlers != null && !handlers.isEmpty()) {
			Object proxyObject = targetObject;
			for (AbstractHandler handler : handlers) {
				handler.setTargetObject(proxyObject);
				proxyObject = Proxy.newProxyInstance(targetObject.getClass().getClassLoader(),
						targetObject.getClass().getInterfaces(), handler);
			}
			return proxyObject;
		}

		return targetObject;
	}
}