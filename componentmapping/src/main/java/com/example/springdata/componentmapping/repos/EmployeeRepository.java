package com.example.springdata.componentmapping.repos;

import org.springframework.data.repository.CrudRepository;

import com.example.springdata.componentmapping.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
