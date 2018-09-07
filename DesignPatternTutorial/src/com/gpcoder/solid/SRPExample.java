/*
 * https://gpcoder.com
 */
package com.gpcoder.solid;

/**
 * SRP – Single responsibility principle example
 * 
 * @author gpcoder
 */
class UserService {
	// Get data from database
	public User getUser() {
		return null;
	}

	public void saveUser() {
		if (this.isValid()) {
			// Do save
		} else {
			// Show error
		}
	}

	// Check validation
	public boolean isValid() {
		return true;
	}

	// Show Notification
	public void showNotification() {

	}

	// Logging
	public void logging() {
		System.out.println("...");
	}

	// Parsing
	public User parseJson(String json) {
		return null;
	}
}

class User {

}

public class SRPExample {

}
