package com.gpcoder.patterns.structural.decorator;

public class Manager extends EmployeeDecorator {

	protected Manager(EmployeeComponent employee) {
		super(employee);
	}

	public void createRequirement() {
		System.out.println(this.employee.getName() + " is create requirements.");
	}

	public void assignTask() {
		System.out.println(this.employee.getName() + " is assigning tasks.");
	}

	public void manageProgress() {
		System.out.println(this.employee.getName() + " is managing the progress.");
	}

	@Override
	public void doTask() {
		employee.doTask();
		createRequirement();
		assignTask();
		manageProgress();
	}
}