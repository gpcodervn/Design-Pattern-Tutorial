/*
 * https://gpcoder.com
 */
package com.gpcoder.solid;

/**
 * OCP - Open/ Closed principle example
 * 
 * @author gpcoder
 */
class UserServiceV2 {
	private Validator validator;

	public UserServiceV2(Validator validator) {
		this.validator = validator;
	}

	public void saveUser() {
		if (this.validator.isValid()) {
			// Do save
		} else {
			// Show error
		}
	}
}

interface Validator {
	boolean isValid();
}

class UserValidator1 implements Validator {
	@Override
	public boolean isValid() {
		return true;
	}
}

class UserValidator2 implements Validator {
	@Override
	public boolean isValid() {
		return false;
	}
}

public class OCPExample {
	public static void main(String[] args) {
		UserServiceV2 userService1 = new UserServiceV2(new UserValidator1());
		UserServiceV2 userService2 = new UserServiceV2(new UserValidator2());
	}
}
