package com.example.springdata.product.repos;

import org.springframework.data.repository.CrudRepository;

import com.example.springdata.product.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
