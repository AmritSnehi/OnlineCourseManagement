package com.snehiOnlineCourse.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.snehiOnlineCourse.entity.Instructor;

public interface InstructorRepository extends JpaRepository<Instructor, Long>{
}

