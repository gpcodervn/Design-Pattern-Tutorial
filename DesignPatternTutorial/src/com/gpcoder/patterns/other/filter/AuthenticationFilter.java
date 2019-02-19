package com.gpcoder.patterns.other.filter;

public class AuthenticationFilter implements Filter {

	@Override
	public void doFilter(HttpRequest request) {
		System.out.println("Authenticating request: " + request);
	}
}