package com.gpcoder.patterns.other.mvc;

public class MVCPatternExample {

	public static void main(String[] args) {
		StudentController controller = new StudentController();
		controller.showDetail();

		controller.changeName("gpcoder");
		controller.save();

		controller.changeName("Java Design Pattern – MVC");
		controller.save();
	}
}
