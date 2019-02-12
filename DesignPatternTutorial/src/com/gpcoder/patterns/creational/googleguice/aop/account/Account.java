package com.gpcoder.patterns.creational.googleguice.aop.account;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Account {

	private String owner;
	private String currency;
	private int balance;
}
