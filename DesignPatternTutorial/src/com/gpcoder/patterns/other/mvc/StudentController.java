package com.gpcoder.patterns.other.mvc;

import java.time.LocalDate;

public class StudentController {

	private StudentModel student;
	private StudentView view;

	public StudentController() {
		student = new StudentModel(1, "No Name", LocalDate.now());
		view = new StudentView();
	}

	public void showDetail() {
		view.showDetailPage(student);
	}

	public void changeName(String newName) {
		student.setName(newName);
	}

	public void save() {
		boolean isSuccess = student.save();
		if (isSuccess) {
			view.showUpdatedPage(student);
		} else {
			view.showErrorMessage();
		}
	}
}
