package com.gpcoder.patterns.structural.decorator;

public class TeamMember extends EmployeeDecorator {

	protected TeamMember(EmployeeComponent employee) {
		super(employee);
	}

	public void performTask() {
		System.out.println(this.employee.getName() + " is performing his assigned tasks.");
	}

	public void coordinateWithOthers() {
		System.out.println(this.employee.getName() + " is coordinating with other members of his team.");
	}

	@Override
	public void doTask() {
		employee.doTask();
		performTask();
		coordinateWithOthers();
	}
}