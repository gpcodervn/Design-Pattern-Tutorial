package com.gpcoder.patterns.structural.bridge;

public class SavingAccount implements Account {

	@Override
	public void openAccount() {
		System.out.println("Saving Account");
	}
}
