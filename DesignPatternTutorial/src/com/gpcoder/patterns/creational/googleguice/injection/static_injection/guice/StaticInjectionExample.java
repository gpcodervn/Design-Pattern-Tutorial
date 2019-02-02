package com.gpcoder.patterns.creational.googleguice.injection.static_injection.guice;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.google.inject.name.Names;

interface Bank {
    String getBankName();
}

class TPBank implements Bank {
    @Override
    public String getBankName() {
        return "TPBank";
    }
}

class VietcomBank implements Bank {
    @Override
    public String getBankName() {
        return "VietcomBank";
    }
}

enum BankType {
    VIETCOMBANK, TPBANK;
}

class BankFactory {
	
	@Inject
	@Named("tpBank")
	private static Bank tpBank ;
	
	@Inject
	@Named("vietcomBank")
	private static Bank vietcomBank;
	
	private BankFactory() {
		throw new UnsupportedOperationException();
	}
 
    public static final Bank getBank(BankType bankType) {
        switch (bankType) {
 
        case TPBANK:
            return tpBank;
 
        case VIETCOMBANK:
            return vietcomBank;
 
        default:
            throw new IllegalArgumentException("This bank type is unsupported");
        }
    }
}

class BaseModule extends AbstractModule {
	@Override
	protected void configure() {
		bind(Bank.class).annotatedWith(Names.named("tpBank")).toInstance(new TPBank());
		bind(Bank.class).annotatedWith(Names.named("vietcomBank")).toInstance(new VietcomBank());
		requestStaticInjection(BankFactory.class);
	}
}

public class StaticInjectionExample {
	public static void main(String[] args) {
		Guice.createInjector(new BaseModule());
		Bank bank = BankFactory.getBank(BankType.TPBANK);
        System.out.println(bank.getBankName()); // TPBank
	}
}
