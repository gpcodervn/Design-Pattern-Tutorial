package com.gpcoder.patterns.other.filter;

public class FilterManager {

	private FilterChain filterChain;

	public FilterManager(Target target) {
		filterChain = new FilterChain();
		filterChain.setTarget(target);
	}

	public void addFilter(Filter filter) {
		filterChain.addFilter(filter);
	}

	public void filterRequest(HttpRequest request) {
		filterChain.doFilter(request);
	}
}
