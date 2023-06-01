package fr.example.demo.controller;

import fr.example.demo.bll.CourseService;
import fr.example.demo.bo.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CourseController {

    @Autowired
    CourseService courseService;

    @GetMapping("/course-test")
    public String courseTest() {
        // Insérer course
        courseService.save(new Course("Course de F2"));

        // Get en base
        Course course1 = courseService.getCourse(1);

        // Affichage course
        System.out.println(course1);

        return "home";
    }
}
