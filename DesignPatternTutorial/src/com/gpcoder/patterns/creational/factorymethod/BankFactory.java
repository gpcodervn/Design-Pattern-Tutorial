/*
 * https://gpcoder.com
 */
package com.gpcoder.patterns.creational.factorymethod;

public class BankFactory {

	private BankFactory() {
	}

	public static final Bank getBank(BankType bankType) {
		switch (bankType) {

		case TPBANK:
			return new TPBank();

		case VIETCOMBANK:
			return new VietcomBank();

		default:
			throw new IllegalArgumentException("This bank type is unsupported");
		}
	}

}
