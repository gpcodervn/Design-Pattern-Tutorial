package com.gpcoder.patterns.behavioral.visitor.singledispatch.example1;

import com.gpcoder.patterns.behavioral.visitor.singledispatch.Book;
import com.gpcoder.patterns.behavioral.visitor.singledispatch.ProgramingBook;

public class SingleDispatchExample {
	public static void main(String[] args) {
		Book book = new ProgramingBook();
		Customer gpcoder = new Developer();
		gpcoder.buy(book); // Developer buy a Book

		ProgramingBook programingBook = new ProgramingBook();
		gpcoder.buy(programingBook); // Developer buy a Programing Book
	}
}
