package com.sis.OnlineCourse_management_system.repository;

import com.sis.OnlineCourse_management_system.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}