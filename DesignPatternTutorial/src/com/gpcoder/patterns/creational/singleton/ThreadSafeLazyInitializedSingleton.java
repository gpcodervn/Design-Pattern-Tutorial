/*
 * https://gpcoder.com
 */
package com.gpcoder.patterns.creational.singleton;

public class ThreadSafeLazyInitializedSingleton {

	private static volatile ThreadSafeLazyInitializedSingleton instance;

	private ThreadSafeLazyInitializedSingleton() {
	}

	public static synchronized ThreadSafeLazyInitializedSingleton getInstance() {
		if (instance == null) {
			instance = new ThreadSafeLazyInitializedSingleton();
		}
		return instance;
	}
}
