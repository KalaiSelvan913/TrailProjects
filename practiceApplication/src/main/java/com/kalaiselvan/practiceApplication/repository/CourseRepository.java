package com.kalaiselvan.practiceApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kalaiselvan.practiceApplication.models.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{

}
