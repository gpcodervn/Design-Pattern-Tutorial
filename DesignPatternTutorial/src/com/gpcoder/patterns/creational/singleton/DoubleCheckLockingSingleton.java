/*
 * https://gpcoder.com
 */
package com.gpcoder.patterns.creational.singleton;

public class DoubleCheckLockingSingleton {

	private static volatile DoubleCheckLockingSingleton instance;

	private DoubleCheckLockingSingleton() {
	}

	public static DoubleCheckLockingSingleton getInstance() {
		// Do something before get instance ...
		if (instance == null) {
			// Do the task too long before create instance ...
			// Block so other threads cannot come into while initialize
			synchronized (DoubleCheckLockingSingleton.class) {
				// Re-check again. Maybe another thread has initialized before
				if (instance == null) {
					instance = new DoubleCheckLockingSingleton();
				}
			}
		}
		// Do something after get instance ...
		return instance;
	}
}
