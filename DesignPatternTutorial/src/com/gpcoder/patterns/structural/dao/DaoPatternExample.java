package com.gpcoder.patterns.structural.dao;

public class DaoPatternExample {

	private static Dao<User> userDao;

	public static void main(String[] args) {
		userDao = new UserDao();

		User user1 = userDao.get(1).get();
		System.out.println("user1: " + user1);
		
		user1.setName("updated." + user1.getName());
		userDao.update(user1);
		
		System.out.println("All users: ");
		userDao.getAll().forEach(user -> System.out.println(user));
	}
}
