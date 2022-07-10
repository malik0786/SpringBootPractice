package com.in28mins.springboot.web.springbootfrirstwebapplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    //Id, Name, author
    @RequestMapping("/allCourses")
    public List<Course> getAllCourses() {
        return Arrays.asList(
                new Course(1, "Ashish", "AWS"),
                new Course(2, "Swasti", "AWS")
        );
    }
}
