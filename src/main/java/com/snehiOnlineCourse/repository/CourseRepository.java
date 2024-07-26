package com.snehiOnlineCourse.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.snehiOnlineCourse.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}

