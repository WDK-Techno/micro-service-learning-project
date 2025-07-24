package com.wdklearn.student_service.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.wdklearn.student_service.model.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {
    // Additional query methods can be defined here if needed

}
