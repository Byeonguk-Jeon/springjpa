package com.example.springdata.product;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.querydsl.QPageRequest;

import com.example.springdata.product.entities.Product;
import com.example.springdata.product.repos.ProductRepository;

@SpringBootTest
class Productdata1ApplicationTests {

	@Autowired
	ProductRepository repository;

	@Test
	void contextLoads() {
	}

	/*
	 * @Test public void testCreate() { Product product = new Product();
	 * product.setId(1); product.setName("Iphone"); product.setDes("Awesome");
	 * product.setPrice(1000d);
	 * 
	 * repository.save(product);
	 * 
	 * }
	 * 
	 * @Test public void testRead() { Product product =
	 * repository.findById(1).get(); System.out.println(product.toString());
	 * 
	 * }
	 * 
	 * @Test public void testUpdate() { Product product =
	 * repository.findById(1).get(); product.setPrice(1200d);
	 * repository.save(product); }
	 * 
	 * @Test public void testDelete() {
	 * 
	 * if (repository.existsById(1)) {
	 * 
	 * repository.deleteById(1);
	 * 
	 * } }
	 * 
	 * @Test public void testCount() {
	 * 
	 * System.out.println(repository.count());
	 * 
	 * }
	 * 
	 * @Test public void testFindByName() { List<Product> product =
	 * repository.findByName("Iphone");
	 * 
	 * product.forEach(p -> System.out.println("name:" + p.getName())); }
	 * 
	 * @Test public void testFindByNameAndDesc() { List<Product> product =
	 * repository.findByNameAndDes("Iphone", "Awesome");
	 * 
	 * product.forEach(p -> System.out.println("name:" + p.getName())); }
	 * 
	 * @Test public void testFindByPriceGreaterThan() { List<Product> product =
	 * repository.findByPriceGreaterThan(1000);
	 * 
	 * product.forEach(p -> System.out.println("name:" + p.getName())); }
	 * 
	 * @Test public void testFindByDescContains() { List<Product> product =
	 * repository.findByDesContains("k");
	 * 
	 * product.forEach(p -> System.out.println("name:" + p.getName())); }
	 * 
	 * @Test public void testFindByPriceBetween() { List<Product> product =
	 * repository.findByPriceBetween(750.000, 850.000);
	 * 
	 * product.forEach(p -> System.out.println("name:" + p.getName())); }
	 * 
	 * @Test public void testFindByDescLike() { List<Product> product =
	 * repository.findByDesLike("%e%");
	 * 
	 * product.forEach(p -> System.out.println("name:" + p.getName())); }
	 * 
	 * @Test public void testFindByIdIn() {
	 * 
	 * List<Integer> ids = new ArrayList<Integer>(); ids.add(1); ids.add(2);
	 * ids.add(3);
	 * 
	 * List<Product> product = repository.findByIdIn(ids);
	 * 
	 * product.forEach(p -> System.out.println("name:" + p.getName())); }
	 */
	
	@Test
	public void testFindAllPaging() {
		
		Pageable pageable = PageRequest.of(0, 2);
		
		Page<Product> result = repository.findAll(pageable);
		result.forEach(p-> System.out.println(p.getName()));
	}
}
