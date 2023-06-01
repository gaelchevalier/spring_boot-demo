package fr.example.demo.dao.jpa;

import fr.example.demo.bo.Course;
import fr.example.demo.dao.CourseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@Profile("jpa")
public class CourseDaoJpaImpl implements CourseDao {

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public Course findById(long id) {
        Optional<Course> course = courseRepository.findById(id);
        return course.get();
    }

}
