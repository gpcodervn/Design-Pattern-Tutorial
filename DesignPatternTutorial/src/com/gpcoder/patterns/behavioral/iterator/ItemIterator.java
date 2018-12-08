package com.gpcoder.patterns.behavioral.iterator;

public interface ItemIterator<T> {
	
	boolean hasNext();
	
	T next();
}
