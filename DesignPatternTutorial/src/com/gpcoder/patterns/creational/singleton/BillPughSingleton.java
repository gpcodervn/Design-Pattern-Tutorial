/*
 * https://gpcoder.com
 */
package com.gpcoder.patterns.creational.singleton;

public class BillPughSingleton {

	private BillPughSingleton() {
	}

	public static BillPughSingleton getInstance() {
		return SingletonHelper.INSTANCE;
	}

	private static class SingletonHelper {
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}
}
