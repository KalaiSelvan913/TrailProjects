package com.kalaiselvan.practiceApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kalaiselvan.practiceApplication.models.Lesson;

public interface LessonRepository extends JpaRepository<Lesson, Long>{

}
