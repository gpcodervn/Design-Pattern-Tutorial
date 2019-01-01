package com.gpcoder.patterns.behavioral.visitor.doubledispatch;

public interface Book {
	void accept(Visitor v);
}