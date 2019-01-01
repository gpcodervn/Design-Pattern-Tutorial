package com.gpcoder.patterns.behavioral.visitor.doubledispatch;

public interface Visitor {

	void visit(BusinessBook book);

	void visit(DesignPatternBook book);

	void visit(JavaCoreBook book);
}