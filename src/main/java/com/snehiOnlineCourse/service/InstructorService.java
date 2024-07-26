package com.snehiOnlineCourse.service;

import java.util.List;

import com.snehiOnlineCourse.entity.Instructor;

public interface InstructorService {
    List<Instructor> findAll();
    Instructor findById(Long id);
    Instructor save(Instructor instructor);
    void deleteById(Long id);
}


