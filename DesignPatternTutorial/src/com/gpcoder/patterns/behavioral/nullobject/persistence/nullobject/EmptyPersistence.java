package com.gpcoder.patterns.behavioral.nullobject.persistence.nullobject;

import com.gpcoder.patterns.behavioral.nullobject.persistence.Persistence;

public class EmptyPersistence implements Persistence {

	private static Persistence persistence;

	public static Persistence getInstance() {
		if (persistence == null) {
			persistence = new EmptyPersistence();
		}
		return persistence;
	}

	private EmptyPersistence() {
		// Do nothing
	}

	@Override
	public void delete() {
		// Do nothing
	}

	@Override
	public void insert(String value) {
		// Do nothing
	}

	@Override
	public void update(String value) {
		// Do nothing
	}

	@Override
	public String get() {
		// Do nothing
		return null;
	}

}