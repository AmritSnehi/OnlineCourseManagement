package com.snehiOnlineCourse.service;

import java.util.List;

import com.snehiOnlineCourse.entity.Lesson;

public interface LessonService {
    List<Lesson> findAll();
    Lesson findById(Long id);
    Lesson save(Lesson lesson);
    void deleteById(Long id);
}


