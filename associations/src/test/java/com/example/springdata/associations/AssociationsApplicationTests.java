package com.example.springdata.associations;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.springdata.associations.onetomany.entities.Customer;
import com.example.springdata.associations.onetomany.entities.PhoneNumber;
import com.example.springdata.associations.onetomany.repos.CustomerRepository;

@SpringBootTest
class AssociationsApplicationTests {

	@Autowired
	CustomerRepository Repository;
	
	@Test
	void contextLoads() {
	}

	@Test
	public void testCreateCustomer() {
		
		Customer cu = new Customer();
		cu.setName("John");
		Set<PhoneNumber> set = new HashSet<PhoneNumber>();
		
		PhoneNumber number = new PhoneNumber();
		number.setNumber("1234567890");
		number.setType("cell");
		// 외래키 null안들어가게 저장하는 방법
		number.setCustomer(cu);
		set.add(number);

		
		PhoneNumber number1 = new PhoneNumber();
		number1.setNumber("2234567890");
		number1.setType("home");
		number1.setCustomer(cu);
		set.add(number1);
		
		cu.setNumbers(set);
		
		Repository.save(cu);
	}
	
}
