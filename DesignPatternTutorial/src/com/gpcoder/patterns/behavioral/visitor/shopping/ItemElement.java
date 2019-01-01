package com.gpcoder.patterns.behavioral.visitor.shopping;

public interface ItemElement {
	int accept(ShoppingCartVisitor visitor);
}
