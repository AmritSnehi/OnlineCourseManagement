package com.snehiOnlineCourse.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snehiOnlineCourse.entity.Instructor;
import com.snehiOnlineCourse.repository.InstructorRepository;
import com.snehiOnlineCourse.service.InstructorService;

import java.util.List;

@Service
public class InstructorServiceImpl implements InstructorService {

    @Autowired
    private InstructorRepository instructorRepository;

    public List<Instructor> findAll() {
        return instructorRepository.findAll();
    }

    public Instructor findById(Long id) {
        return instructorRepository.findById(id).orElse(null);
    }

    public Instructor save(Instructor instructor) {
        return instructorRepository.save(instructor);
    }

    public void deleteById(Long id) {
        instructorRepository.deleteById(id);
    }
}

