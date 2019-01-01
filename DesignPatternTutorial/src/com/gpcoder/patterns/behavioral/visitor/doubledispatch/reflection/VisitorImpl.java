package com.gpcoder.patterns.behavioral.visitor.doubledispatch.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class VisitorImpl extends Visitor {

	public void visit(Book book) {
		Method downPolymorphic = getMethod(book.getClass());
		if (downPolymorphic == null) {
			defaultVisit(book);
		} else {
			try {
				downPolymorphic.invoke(this, book);
			} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
				e.printStackTrace();
			}
		}
	}

	public void visit(BusinessBook a) {
		System.out.println(a.getPublisher());
	}

	public void visit(DesignPatternBook w) {
		System.out.println(w.getBestSeller());
	}

	public void visit(JavaCoreBook g) {
		System.out.println(g.getFavouriteBook());
	}
}