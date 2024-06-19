package com.scentedentity.olfactoryfaculty.service;

import java.util.List;
import java.util.Set;
import com.scentedentity.olfactoryfaculty.entity.Course;
import com.scentedentity.olfactoryfaculty.entity.Student;

public interface StudentService {
    Student getStudent(Long id);
    Student saveStudent(Student student);
    void deleteStudent(Long id);
    List<Student> getStudents();
    Set<Course> getEnrolledCourses(Long id);
}
