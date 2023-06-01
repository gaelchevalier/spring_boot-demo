package fr.example.demo.bll;

import fr.example.demo.bo.Course;
import fr.example.demo.dao.CourseDao;
import fr.example.demo.dao.jpa.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepository;

    public void save(Course course) {
        courseRepository.save(course);
    }

    public Course getCourse(long id) {
        Optional<Course> course = courseRepository.findById(id);
        return course.get();
    }
}
