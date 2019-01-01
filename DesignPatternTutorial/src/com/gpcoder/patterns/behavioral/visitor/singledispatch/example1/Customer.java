package com.gpcoder.patterns.behavioral.visitor.singledispatch.example1;

import com.gpcoder.patterns.behavioral.visitor.singledispatch.Book;
import com.gpcoder.patterns.behavioral.visitor.singledispatch.BusinessBook;
import com.gpcoder.patterns.behavioral.visitor.singledispatch.ProgramingBook;

public interface Customer {

	void buy(Book book);

	void buy(ProgramingBook book);

	void buy(BusinessBook book);

}
