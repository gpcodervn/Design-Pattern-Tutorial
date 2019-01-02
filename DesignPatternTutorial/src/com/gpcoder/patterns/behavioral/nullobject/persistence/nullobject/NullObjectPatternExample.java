package com.gpcoder.patterns.behavioral.nullobject.persistence.nullobject;

import com.gpcoder.patterns.behavioral.nullobject.persistence.Persistence;

public class NullObjectPatternExample {

	private Persistence persistence = EmptyPersistence.getInstance();

	public void persistence(Persistence persistence) {
		this.persistence = persistence;
	}

	public String get() {
		return persistence.get();
	}

	public void insert(String value) {
		persistence.insert(value);
	}

	public void update(String value) {
		persistence.update(value);
	}

	public void delete() {
		persistence.delete();
	}
}