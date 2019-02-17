package com.gpcoder.patterns.other.mvc;

import java.time.format.DateTimeFormatter;

public class StudentView {
	
	public void showHomePage() {
		System.out.println("Home page of Student");
	}

	public void showDetailPage(StudentModel student) {
		System.out.println("Student: ");
		System.out.println("+ Id: " + student.getId());
		System.out.println("+ Name: " + student.getName());
		System.out.println("+ Updated date: " + 
				student.getUpdatedDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println("---------------------------");
	}
	
	public void showUpdatedPage(StudentModel student) {
		System.out.println("Saved successfully");
		showDetailPage(student);
	}
	
	public void showErrorMessage() {
		System.out.println("ERROR!!!");
	}
}
