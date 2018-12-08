package com.gpcoder.patterns.behavioral.iterator;

public class Item {
	private String title;
	private String url;

	public Item(String title, String url) {
		super();
		this.title = title;
		this.url = url;
	}

	@Override
	public String toString() {
		return "Item [title=" + title + ", url=" + url + "]";
	}
}
