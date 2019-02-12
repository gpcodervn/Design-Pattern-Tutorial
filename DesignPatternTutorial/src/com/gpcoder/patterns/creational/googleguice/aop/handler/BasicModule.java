package com.gpcoder.patterns.creational.googleguice.aop.handler;

import com.google.inject.AbstractModule;
import com.gpcoder.patterns.creational.googleguice.aop.account.AccountService;
import com.gpcoder.patterns.creational.googleguice.aop.account.AccountServiceImpl;

public class BasicModule extends AbstractModule {

	@Override
    protected void configure() {
		bind(AccountService.class).to(AccountServiceImpl.class);
	}
}
