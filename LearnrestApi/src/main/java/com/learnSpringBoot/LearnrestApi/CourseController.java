package com.learnSpringBoot.LearnrestApi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @GetMapping("/courses")
    public List<Course> fetchAllCourses(){
        return Arrays.asList(new Course(1,"Harry Potter","J.K.Rowling"),
                new Course(1,"Happening Now","Chetna Arya"));
    }
}
