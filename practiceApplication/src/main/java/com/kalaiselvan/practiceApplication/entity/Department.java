package com.kalaiselvan.practiceApplication.entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;

@Data
@Entity
public class Department implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "dept_seq" )
	@SequenceGenerator(name = "dept_seq", sequenceName = "dept_sequence", allocationSize = 1)
	private Long deptId;
	
	@Column(name = "DEPARTMENT_NAME")
	private String departmentName;
	
	@OneToMany(mappedBy = "department")
	private List<Employee> employees;


}
