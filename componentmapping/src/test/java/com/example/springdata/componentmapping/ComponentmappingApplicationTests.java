package com.example.springdata.componentmapping;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.springdata.componentmapping.entities.Address;
import com.example.springdata.componentmapping.entities.Employee;
import com.example.springdata.componentmapping.repos.EmployeeRepository;

@SpringBootTest
class ComponentmappingApplicationTests {

	@Autowired
	EmployeeRepository Repository;
	
	@Test
	void contextLoads() {
	}

	@Test
	public void testCreate() {
		Employee em = new Employee();
		Address address = new Address();
		em.setId(123);
		em.setName("Bharath");
		address.setCity("Austin");
		address.setStreetaddress("Spicewood Springs");
		address.setCountry("USA");
		address.setState("TEXAS");
		address.setZipcode("78750");
		em.setAddress(address);
		Repository.save(em);
	}
}
