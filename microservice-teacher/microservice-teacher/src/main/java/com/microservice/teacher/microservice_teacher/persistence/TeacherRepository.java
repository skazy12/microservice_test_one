package com.microservice.teacher.microservice_teacher.persistence;

import com.microservice.teacher.microservice_teacher.entities.Teacher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends CrudRepository<Teacher, Long> {
}