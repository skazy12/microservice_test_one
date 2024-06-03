package com.microservice.teacher.microservice_teacher.service;

import com.microservice.teacher.microservice_teacher.entities.Teacher;

import java.util.List;

public interface ITeacherService {

    List<Teacher> findAll();
    Teacher findById(Long id);
    void save(Teacher teacher);
}