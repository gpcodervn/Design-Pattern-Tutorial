package com.gpcoder.patterns.creational.googleguice.injection.static_injection.factory_pattern;

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
	 
	private static Bank tpBank = new TPBank();
	private static Bank vietcomBank = new VietcomBank();
	
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

public class StaticInjectionExample {
	public static void main(String[] args) {
		Bank bank = BankFactory.getBank(BankType.TPBANK);
        System.out.println(bank.getBankName()); // TPBank
	}
}
