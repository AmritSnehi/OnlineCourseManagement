package com.snehiOnlineCourse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.snehiOnlineCourse.entity.Instructor;
import com.snehiOnlineCourse.service.InstructorService;

import java.util.List;

@Controller
public class InstructorController {

    @Autowired
    private InstructorService instructorService;

    @GetMapping("/instructors")
    public String listInstructors(Model model) {
        List<Instructor> instructors = instructorService.findAll();
        model.addAttribute("instructors", instructors);
        return "instructor/instructor-list";
    }

    @GetMapping("/instructors/{id}")
    public String instructorDetails(@PathVariable Long id, Model model) {
        Instructor instructor = instructorService.findById(id);
        model.addAttribute("instructor", instructor);
        return "instructor/instructor-detail";
    }
}


