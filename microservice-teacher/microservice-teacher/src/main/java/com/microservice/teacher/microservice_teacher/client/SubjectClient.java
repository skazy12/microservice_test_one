package com.microservice.teacher.microservice_teacher.client;

import com.microservice.teacher.microservice_teacher.dto.SubjectDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "msvc-subject")
public interface SubjectClient {
    @GetMapping("/api/subject")
    List<SubjectDto> getAllSubjects();

    @GetMapping("/api/subject/{id}")
    SubjectDto getSubjectById(@PathVariable Long id);
}