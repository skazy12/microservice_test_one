package com.microservice.subject.microservice_subject.persistence;

import com.microservice.subject.microservice_subject.entities.Subject;
import org.springframework.data.repository.CrudRepository;

public interface SubjectRepository extends CrudRepository<Subject, Long> {
}
