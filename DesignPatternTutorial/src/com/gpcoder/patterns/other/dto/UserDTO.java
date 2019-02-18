package com.gpcoder.patterns.other.dto;

import lombok.Data;

/**
 * Data Transfer Object
 */
@Data
public class UserDTO {

	private Integer id;
	private String userName;
	private String fullName;
	private String email;
}
