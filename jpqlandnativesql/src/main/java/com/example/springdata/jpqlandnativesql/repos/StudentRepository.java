package com.example.springdata.jpqlandnativesql.repos;

import org.springframework.data.repository.CrudRepository;

import com.example.springdata.jpqlandnativesql.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
