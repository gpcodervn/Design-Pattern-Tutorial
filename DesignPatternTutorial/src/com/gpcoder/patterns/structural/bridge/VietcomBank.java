package com.gpcoder.patterns.structural.bridge;

public class VietcomBank extends Bank {

	public VietcomBank(Account account) {
		super(account);
	}

	@Override
	public void openAccount() {
		System.out.print("Open your account at VietcomBank is a ");
		account.openAccount();
	}
}
