package com.gpcoder.patterns.behavioral.templatemethod.template;

public class DetailPage extends PageTemplate {

	@Override
	protected void showBody() {
		System.out.println("Content of detail");
	}
}
