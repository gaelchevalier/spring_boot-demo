package fr.example.demo.dao.jpa;

import fr.example.demo.bo.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Long> {
}
