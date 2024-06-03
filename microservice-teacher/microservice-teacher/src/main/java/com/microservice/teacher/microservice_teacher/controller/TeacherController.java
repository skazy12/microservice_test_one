package com.microservice.teacher.microservice_teacher.controller;

import com.microservice.teacher.microservice_teacher.client.SubjectClient;
import com.microservice.teacher.microservice_teacher.entities.Teacher;
import com.microservice.teacher.microservice_teacher.persistence.TeacherRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import com.microservice.teacher.microservice_teacher.dto.SubjectDto;

import java.util.List;

@RestController
@RequestMapping("/api/teacher")
public class TeacherController {
    @Autowired
    private TeacherRepository teacherRepository;

    @Autowired
    private SubjectClient subjectClient;

    @GetMapping
    public List<Teacher> getAllTeachers() {
        return (List<Teacher>) teacherRepository.findAll();
    }

    @GetMapping("/{id}")
    public Teacher getTeacherById(@PathVariable Long id) {
        return teacherRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Teacher createTeacher(@RequestBody Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    @PutMapping("/{id}")
    public Teacher updateTeacher(@PathVariable Long id, @RequestBody Teacher teacherDetails) {
        Teacher teacher = teacherRepository.findById(id).orElse(null);
        if (teacher != null) {
            teacher.setName(teacherDetails.getName());
            teacher.setDepartment(teacherDetails.getDepartment());
            return teacherRepository.save(teacher);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteTeacher(@PathVariable Long id) {
        teacherRepository.deleteById(id);
    }

    @GetMapping("/subjects")
    public List<SubjectDto> getAllSubjects() {
        return subjectClient.getAllSubjects();
    }

    @GetMapping("/subjects/{id}")
    public SubjectDto getSubjectById(@PathVariable Long id) {
        return subjectClient.getSubjectById(id);
    }
}