package com.kalaiselvan.practiceApplication.dto;

import java.util.List;

import com.kalaiselvan.practiceApplication.entity.Employee;

import lombok.Data;

@Data
public class DepartmentDto {
	
	private Long deptId;
	
	private String departmentName;
	
	private List<Employee> employees;
}
