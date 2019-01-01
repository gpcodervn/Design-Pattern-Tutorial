package com.gpcoder.patterns.behavioral.visitor.singledispatch.example2;

import com.gpcoder.patterns.behavioral.visitor.singledispatch.Book;
import com.gpcoder.patterns.behavioral.visitor.singledispatch.BusinessBook;
import com.gpcoder.patterns.behavioral.visitor.singledispatch.ProgramingBook;
import com.gpcoder.patterns.behavioral.visitor.singledispatch.example1.Customer;

public class Developer2 implements Customer {

	@Override
	public void buy(Book book) {
		if (book instanceof ProgramingBook) {
			ProgramingBook programingBook = (ProgramingBook) book;
			buy(programingBook);
		} else if (book instanceof BusinessBook) {
			BusinessBook businessBook = (BusinessBook) book;
			buy(businessBook);
		} else {
			System.out.println("Developer buy a Book");
		}
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
