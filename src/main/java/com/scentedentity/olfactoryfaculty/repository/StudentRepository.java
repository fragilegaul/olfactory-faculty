package com.scentedentity.olfactoryfaculty.repository;

import org.springframework.data.repository.CrudRepository;
import com.scentedentity.olfactoryfaculty.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {
    
}
