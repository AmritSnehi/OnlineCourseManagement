package com.snehiOnlineCourse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.snehiOnlineCourse.entity.Lesson;

@Repository
public interface LessonRepository extends JpaRepository<Lesson, Long> {
}

