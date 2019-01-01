package com.gpcoder.patterns.behavioral.visitor.singledispatch.example2;

import com.gpcoder.patterns.behavioral.visitor.singledispatch.Book;
import com.gpcoder.patterns.behavioral.visitor.singledispatch.ProgramingBook;
import com.gpcoder.patterns.behavioral.visitor.singledispatch.example1.Customer;

public class SingleDispatchExample2 {
	public static void main(String[] args) {
		Book book = new ProgramingBook();
		Customer gpcoder = new Developer2();
		gpcoder.buy(book); // Developer buy a Programing Book

		ProgramingBook programingBook = new ProgramingBook();
		gpcoder.buy(programingBook); // Developer buy a Programing Book
	}
}
