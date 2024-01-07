package com.kalaiselvan.practiceApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kalaiselvan.practiceApplication.entity.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
