package com.gpcoder.patterns.structural.bridge;

public class Client {

	public static void main(String[] args) {
		Bank vietcomBank = new VietcomBank(new CheckingAccount());
		vietcomBank.openAccount();

		Bank tpBank = new TPBank(new CheckingAccount());
		tpBank.openAccount();
	}
}
