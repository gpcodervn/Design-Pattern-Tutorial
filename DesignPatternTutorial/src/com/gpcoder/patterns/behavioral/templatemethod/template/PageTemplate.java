package com.gpcoder.patterns.behavioral.templatemethod.template;

public abstract class PageTemplate {

	protected void showHeader() {
		System.out.println("<header />");
	}

	protected void showNavigation() {
		System.out.println("<nav />");
	}

	protected void showFooter() {
		System.out.println("<footer />");
	}

	protected abstract void showBody();

	public final void showPage() {
		showHeader();
		showNavigation();
		showBody();
		showFooter();
	}
}
