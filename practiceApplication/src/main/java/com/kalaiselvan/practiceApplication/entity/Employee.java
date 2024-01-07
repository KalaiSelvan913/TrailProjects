package com.kalaiselvan.practiceApplication.entity;



import java.io.Serializable;
import java.sql.Date;

import com.kalaiselvan.practiceApplication.util.EnumType.Gender;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.validation.constraints.Email;
import lombok.Data;

@Data
@Entity
public class Employee implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "emp_seq")
	@SequenceGenerator(name = "emp_seq", sequenceName = "emp_sequence", allocationSize = 1)
	private Long id;
	
	@Column(name = "FIRST_NAME")
	private String firstName;
	
	@Column(name = "LAST_NAME")
	private String lastName;
	
	@Column(name = "DOB")
	private Date dateOfBirth;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "GENDER")
	private Gender gender;
	
	@Email(message = "Invalid Email Format")
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "PHONE_NUMBER")
	private String phoneNumber;
	
	@Column(name ="ADDRESS")
	private String address;
	
	@Column(name = "HIRE_DATE")
	private Date hireDate;
	
	@ManyToOne
	@JoinColumn(name = "DEPARTMENT_ID")
	private Department department;
	
	@Column(name = "ROLE")
	private String role;
	

}
