package com.gpcoder.patterns.other.filter;

public class InterceptingFilterPatternExample {

	public static void main(String[] args) {
		FilterManager filterManager = new FilterManager(new Target());
		filterManager.addFilter(new TrackingFilter());
		filterManager.addFilter(new AuthenticationFilter());

		HttpRequest request = new HttpRequest();
		request.setClientIp("127.0.0.1");
		request.setTargetUrl("/home");

		Client client = new Client(filterManager);
		client.sendRequest(request);
	}
}
