package com.example.springdata.hibernateinheritance.repos;

import org.springframework.data.repository.CrudRepository;

import com.example.springdata.hibernateinheritance.entities.Payment;

public interface PaymentRepository extends CrudRepository<Payment, Integer> {

}
