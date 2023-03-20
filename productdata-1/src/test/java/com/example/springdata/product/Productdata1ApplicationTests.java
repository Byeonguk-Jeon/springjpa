package com.example.springdata.product;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.springdata.product.entities.Product;
import com.example.springdata.product.repos.ProductRepository;

@SpringBootTest
class Productdata1ApplicationTests {

	@Autowired
	ProductRepository repository;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	public void testCreate() {
		Product product = new Product();
		product.setId(2);
		product.setName("Iphone");
		product.setDes("Awesome");
		product.setPrice(1000d);
		
		repository.save(product);
		
	}

}
