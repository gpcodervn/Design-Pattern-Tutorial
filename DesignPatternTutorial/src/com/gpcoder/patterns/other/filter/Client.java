package com.gpcoder.patterns.other.filter;

public class Client {

	private FilterManager filterManager;

	public Client(FilterManager filterManager) {
		this.filterManager = filterManager;
	}

	public void sendRequest(HttpRequest request) {
		filterManager.filterRequest(request);
	}
}
