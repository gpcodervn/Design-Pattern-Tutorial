package com.gpcoder.patterns.structural.bridge;

public class TPBank extends Bank {

	public TPBank(Account account) {
		super(account);
	}

	@Override
	public void openAccount() {
		System.out.print("Open your account at TPBank is a ");
		account.openAccount();
	}
}
