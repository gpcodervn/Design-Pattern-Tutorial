package com.gpcoder.patterns.behavioral.nullobject.persistence;

public interface Persistence {

	void delete();

	void insert(String value);

	void update(String value);

	String get();
}
