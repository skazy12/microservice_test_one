package com.microservice.subject.microservice_subject.controller;

import com.microservice.subject.microservice_subject.entities.Subject;
import com.microservice.subject.microservice_subject.persistence.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/subject")
public class SubjectController {
    @Autowired
    private SubjectRepository subjectRepository;

    @GetMapping
    public List<Subject> getAllSubjects() {
        return (List<Subject>) subjectRepository.findAll();
    }

    @GetMapping("/{id}")
    public Subject getSubjectById(@PathVariable Long id) {
        return subjectRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Subject createSubject(@RequestBody Subject subject) {
        return subjectRepository.save(subject);
    }

    @PutMapping("/{id}")
    public Subject updateSubject(@PathVariable Long id, @RequestBody Subject subjectDetails) {
        Subject subject = subjectRepository.findById(id).orElse(null);
        if (subject != null) {
            subject.setName(subjectDetails.getName());
            subject.setDescription(subjectDetails.getDescription());
            return subjectRepository.save(subject);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteSubject(@PathVariable Long id) {
        subjectRepository.deleteById(id);
    }
}