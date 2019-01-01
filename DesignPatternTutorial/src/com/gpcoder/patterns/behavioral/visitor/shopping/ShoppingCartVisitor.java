package com.gpcoder.patterns.behavioral.visitor.shopping;

public interface ShoppingCartVisitor {

	int visit(Book book);

	int visit(Fruit fruit);
}