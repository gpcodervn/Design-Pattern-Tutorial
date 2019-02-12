package com.gpcoder.patterns.creational.googleguice.aop;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.gpcoder.patterns.creational.googleguice.aop.account.Account;
import com.gpcoder.patterns.creational.googleguice.aop.account.AccountService;
import com.gpcoder.patterns.creational.googleguice.aop.account.AccountServiceImpl;
import com.gpcoder.patterns.creational.googleguice.aop.handler.AOPModule;
import com.gpcoder.patterns.creational.googleguice.aop.handler.BasicModule;

/**
 * This class to verify an AOP example using Google Guice.
 */
public class AspectOrientedProgrammingWithGuice {

	public static void main(String[] args) {

		Injector injector = Guice.createInjector(new BasicModule(), new AOPModule());
		AccountService proxy = injector.getInstance(AccountServiceImpl.class);

		Account account = new Account("gpcoder", "USD", 100);
		proxy.addAccount(account);
		proxy.getSize();
		proxy.removeAccount(account);
		proxy.getSize();
	}
}