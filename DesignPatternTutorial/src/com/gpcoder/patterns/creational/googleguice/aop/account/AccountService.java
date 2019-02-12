package com.gpcoder.patterns.creational.googleguice.aop.account;

public interface AccountService {

	void addAccount(Account account);

	void removeAccount(Account account);
	
	int getSize();
}
