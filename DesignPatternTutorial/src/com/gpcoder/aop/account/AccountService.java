package com.gpcoder.aop.account;

public interface AccountService {

	void addAccount(Account account);

	void removeAccount(Account account);
	
	int getSize();
}
