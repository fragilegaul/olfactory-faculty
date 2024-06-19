package com.scentedentity.olfactoryfaculty.service;

import com.scentedentity.olfactoryfaculty.entity.Course;
import com.scentedentity.olfactoryfaculty.entity.Student;
import java.util.List;
import java.util.Set;

public interface CourseService {
    Course getCourse(Long id);
    Course saveCourse(Course course);
    void deleteCourse(Long id);    
    Course addStudentToCourse(Long studentId, Long courseId);
    List<Course> getCourses();
    Set<Student> getEnrolledStudents(Long id);
    
} 
