/*
 * https://gpcoder.com
 */
package com.gpcoder.patterns.creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionBreakSingleton {

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, InvocationTargetException {
		
		EagerInitializedSingleton instanceOne = EagerInitializedSingleton.getInstance();
		EagerInitializedSingleton instanceTwo = null;

		Constructor<?>[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
		for (Constructor<?> constructor : constructors) {
			constructor.setAccessible(true);
			instanceTwo = (EagerInitializedSingleton) constructor.newInstance();
		}

		System.out.println(instanceOne.hashCode());
		System.out.println(instanceTwo.hashCode());
	}
}
