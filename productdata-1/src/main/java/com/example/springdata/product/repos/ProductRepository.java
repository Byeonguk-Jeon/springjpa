package com.example.springdata.product.repos;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.springdata.product.entities.Product;

public interface ProductRepository extends PagingAndSortingRepository<Product, Integer> {

	List<Product> findByName(String name);

	List<Product> findByNameAndDes(String name, String desc);

	List<Product> findByPriceGreaterThan(int price);

	List<Product> findByDesContains(String desc);

	List<Product> findByPriceBetween(Double price1, Double price2);

	List<Product> findByDesLike(String desc);
	
	List<Product> findByIdIn(List<Integer> ids, org.springframework.data.domain.Pageable pageable);
}
