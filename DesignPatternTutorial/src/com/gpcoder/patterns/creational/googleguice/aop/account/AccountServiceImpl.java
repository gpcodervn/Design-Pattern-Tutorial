package com.gpcoder.patterns.creational.googleguice.aop.account;

import java.util.ArrayList;
import java.util.List;

import com.gpcoder.patterns.creational.googleguice.aop.handler.Loggable;

public class AccountServiceImpl implements AccountService {

	private List<Account> accounts = new ArrayList<>();

	@Loggable
	@Override
	public void addAccount(Account account) {
		System.out.println("addAccount: " + account);
		accounts.add(account);
	}

	@Loggable
	@Override
	public void removeAccount(Account account) {
		System.out.println("removeAccount: " + account);
		accounts.remove(account);
	}

	@Loggable
	@Override
	public int getSize() {
		System.out.println("getSize: " + accounts.size());
		return accounts.size();
	}
}