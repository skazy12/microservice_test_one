package com.microservice.teacher.microservice_teacher.service;

import com.microservice.teacher.microservice_teacher.entities.Teacher;
import com.microservice.teacher.microservice_teacher.persistence.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements ITeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    @Override
    public List<Teacher> findAll() {
        return (List<Teacher>) teacherRepository.findAll();
    }

    @Override
    public Teacher findById(Long id) {
        return teacherRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Teacher teacher) {
        teacherRepository.save(teacher);
    }
}