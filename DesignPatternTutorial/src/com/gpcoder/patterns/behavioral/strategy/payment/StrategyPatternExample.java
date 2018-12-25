package com.gpcoder.patterns.behavioral.strategy.payment;

public class StrategyPatternExample {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();

		Item item1 = new Item("Elements of Reusable Object-Oriented Software – GOF", 40);
		Item item2 = new Item("Design Pattern for Dummy", 50);

		cart.addItem(item1);
		cart.addItem(item2);

		// pay by paypal
		cart.pay(new PaypalStrategy("javadesignpattern@gpcoder.com", "LapTrinhJava"));

		// pay by credit card
		cart.pay(new CreditCardStrategy("GP Coder", "1234567890", "407", "10/17"));
	}
}
