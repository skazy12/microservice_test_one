package com.microservice.student.persistence;

import com.microservice.student.entities.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long>{
    List<Student> findAllByCourseId(long courseId);
    // This query is equivalent to the previous one
    @Query("SELECT s FROM Student s WHERE s.courseId = :courseId")
    List<Student> findAllStudent(long courseId);
}
