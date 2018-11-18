package com.gpcoder.patterns.structural.proxy.protection;

public class Client {
	public static void main(String[] args) {
		UserService admin = new UserServiceProxy("gpcoder", "admin");
		admin.load();
		admin.insert();

		UserService customer = new UserServiceProxy("customer", "guest");
		customer.load();
		customer.insert();
	}
}
