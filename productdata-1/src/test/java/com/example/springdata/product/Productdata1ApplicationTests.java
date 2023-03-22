package com.example.springdata.product;

import java.util.Optional;

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
		product.setId(1);
		product.setName("Iphone");
		product.setDes("Awesome");
		product.setPrice(1000d);

		repository.save(product);

	}

	@Test
	public void testRead() {
		Product product = repository.findById(1).get();
		System.out.println(product.toString());

	}

	@Test
	public void testUpdate() {
		Product product = repository.findById(1).get();
		product.setPrice(1200d);
		repository.save(product);
	}

	@Test
	public void testDelete() {

		if (repository.existsById(1)) {

			repository.deleteById(1);

		}
	}

	@Test
	public void testCount() {

		System.out.println(repository.count());

	}
}
