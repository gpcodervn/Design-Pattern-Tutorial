package com.gpcoder.aop;

import java.util.ArrayList;
import java.util.List;

import com.gpcoder.aop.account.Account;
import com.gpcoder.aop.account.AccountService;
import com.gpcoder.aop.account.AccountServiceImpl;
import com.gpcoder.aop.handler.AbstractHandler;
import com.gpcoder.aop.handler.ProxyFactory;
import com.gpcoder.aop.handler.impl.AfterHandlerImpl;
import com.gpcoder.aop.handler.impl.BeforeHandlerImpl;

/**
 * This class to verify an AOP example using JDK proxy.
 */
public class AspectOrientedProgrammingInJdkExample {

	public static void main(String[] args) {

		List<AbstractHandler> handlers = new ArrayList<>();
		handlers.add(new BeforeHandlerImpl());
		handlers.add(new AfterHandlerImpl());

		AccountService proxy = (AccountService) ProxyFactory.getProxy(new AccountServiceImpl(), handlers);
		Account account = new Account("gpcoder", "USD", 100);
		proxy.addAccount(account);
		proxy.getSize();
		proxy.removeAccount(account);
		proxy.getSize();
	}
}