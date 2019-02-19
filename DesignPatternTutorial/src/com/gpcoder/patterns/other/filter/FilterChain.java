package com.gpcoder.patterns.other.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {

	private List<Filter> filters = new ArrayList<>();

	private Target target;

	public void addFilter(Filter filter) {
		filters.add(filter);
	}

	public void doFilter(HttpRequest request) {
		// Do some pre-processing
		for (Filter filter : filters) {
			filter.doFilter(request);
		}

		// Execute actual processing by target
		target.execute(request);

		// Do some pos-processing
	}

	public void setTarget(Target target) {
		this.target = target;
	}
}
