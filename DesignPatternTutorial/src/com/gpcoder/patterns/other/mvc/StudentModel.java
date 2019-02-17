package com.gpcoder.patterns.other.mvc;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StudentModel {

	private Integer id;
	private String name;
	private LocalDate updatedDate;

	public boolean save() {
		if (name.length() <= 10) {
			this.updatedDate = LocalDate.now();
			return true;
		}
		return false;
	}
}
