package com.gpcoder.patterns.structural.decorator;

import java.util.Date;

public class EmployeeConcreteComponent implements EmployeeComponent {
	
	private String name;
	
	public EmployeeConcreteComponent (String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void join(Date joinDate) {
		System.out.println(this.getName() + " joined on " + formatDate(joinDate));
	}

	@Override
	public void terminate(Date terminateDate) {
		System.out.println(this.getName() + " terminated on " + formatDate(terminateDate));		
	}

	@Override
	public void doTask() {
		// Unassigned task
	}
}
