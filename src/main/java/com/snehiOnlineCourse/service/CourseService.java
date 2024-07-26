package com.snehiOnlineCourse.service;

import java.util.List;

import com.snehiOnlineCourse.entity.Course;

public interface CourseService {
    List<Course> findAll();
    Course findById(Long id);
    Course save(Course course);
    void deleteById(Long id);
}


