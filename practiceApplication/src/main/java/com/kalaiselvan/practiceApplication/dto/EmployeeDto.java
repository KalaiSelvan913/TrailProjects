package com.kalaiselvan.practiceApplication.dto;

import java.sql.Date;

import com.kalaiselvan.practiceApplication.entity.Department;
import com.kalaiselvan.practiceApplication.util.EnumType.Gender;

import lombok.Data;

@Data
public class EmployeeDto {
	
private Long id;
	
	private String firstName;
	
	private String lastName;
	
	private String dateOfBirth;
	
	private Gender gender;
	
	private String email;
	
	private String phoneNumber;
	
	private String address;
	
	private Date hireDate;
	
	private Department department;
	
	private String role;

}
