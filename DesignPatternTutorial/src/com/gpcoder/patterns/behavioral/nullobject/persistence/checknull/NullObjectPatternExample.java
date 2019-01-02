package com.gpcoder.patterns.behavioral.nullobject.persistence.checknull;

import com.gpcoder.patterns.behavioral.nullobject.persistence.Persistence;

public class NullObjectPatternExample {

	private Persistence persistence;

	public void persistence(Persistence persistence) {
		this.persistence = persistence;
	}

	public String get() {
		if (persistence != null) {
			return persistence.get();
		}
		return null;
	}

	public void insert(String value) {
		if (persistence != null) {
			persistence.insert(value);
		}
	}

	public void update(String value) {
		if (persistence != null) {
			persistence.update(value);
		}
	}

	public void delete() {
		if (persistence != null) {
			persistence.delete();
		}
	}
}