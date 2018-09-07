/*
 * https://gpcoder.com
 */
package com.gpcoder.patterns.creational.singleton;

public class EagerInitializedSingleton {

	private static final EagerInitializedSingleton INSTANCE = new EagerInitializedSingleton();

	// private constructor to avoid client applications to use constructor
	private EagerInitializedSingleton() {
		
	}

	public static EagerInitializedSingleton getInstance() {
		return INSTANCE;
	}
}
