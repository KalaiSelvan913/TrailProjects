package com.kalaiselvan.practiceApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kalaiselvan.practiceApplication.entity.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Long>{

}
