package com.gpcoder.patterns.behavioral.visitor.singledispatch.example1;

import com.gpcoder.patterns.behavioral.visitor.singledispatch.Book;
import com.gpcoder.patterns.behavioral.visitor.singledispatch.BusinessBook;
import com.gpcoder.patterns.behavioral.visitor.singledispatch.ProgramingBook;

public class Developer implements Customer {

	@Override
	public void buy(Book book) {
		System.out.println("Developer buy a Book");
	}

	@Override
	public void buy(ProgramingBook book) {
		System.out.println("Developer buy a Programing Book");

	}

	@Override
	public void buy(BusinessBook book) {
		System.out.println("Developer buy a Business Book");
	}
}
