package com.gpcoder.patterns.other.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserDao implements Dao<UserModel> {

	// Temporary database
	private List<UserModel> users = new ArrayList<>();

	public UserDao() {
		UserModel user = new UserModel();
		user.setId(1);
		user.setUserName("gpcoder");
		user.setEmail("gpcodervn@gmail.com");
		user.setFullName("GP Coder");
		user.setPassword("1234567");
		user.setBankAccount("9999-9999-9999");
		users.add(user);
	}

	@Override
	public List<UserModel> getAll() {
		return users;
	}

	@Override
	public Optional<UserModel> get(Integer id) {
		return users.stream().filter(u -> u.getId() == id).findFirst();
	}

	@Override
	public void save(UserModel user) {
		users.add(user);
	}

	@Override
	public void update(UserModel user) {
		int index = -1;
		for (UserModel u : users) {
			index++;
			if (user.getId().equals(u.getId())) {
				users.set(index, user);
				break;
			}
		}
	}

	@Override
	public void delete(UserModel user) {
		get(user.getId()).ifPresent(existUser -> users.remove(existUser));
	}
}