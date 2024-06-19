package com.scentedentity.olfactoryfaculty.repository;

import org.springframework.data.repository.CrudRepository;
import com.scentedentity.olfactoryfaculty.entity.Course;

public interface CourseRepository extends CrudRepository<Course, Long>{
    
}
