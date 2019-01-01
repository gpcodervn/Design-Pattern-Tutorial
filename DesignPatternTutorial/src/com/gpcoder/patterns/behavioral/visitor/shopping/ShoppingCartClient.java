package com.gpcoder.patterns.behavioral.visitor.shopping;

/**
 * https://www.journaldev.com/1769/visitor-design-pattern-java
 */
public class ShoppingCartClient {

	public static void main(String[] args) {
		ItemElement[] items = new ItemElement[] { //
				new Book(20, "Elements of Reusable Object-Oriented Software"), //
				new Book(100, "Design Pattern for dummies"), //
				new Fruit(10, 2, "Banana"), //
				new Fruit(5, 5, "Apple") //
		};

		int total = calculatePrice(items);
		System.out.println("Total Cost = " + total);
	}

	private static int calculatePrice(ItemElement[] items) {
		ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
		int sum = 0;
		for (ItemElement item : items) {
			sum = sum + item.accept(visitor);
		}
		return sum;
	}
}
