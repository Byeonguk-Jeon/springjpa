package com.example.springdata.idgenerators;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.springdata.idgenerators.entities.Employee;
import com.example.springdata.idgenerators.repos.EmployeeRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
class IdgeneratorsApplicationTests {

	@Autowired
	EmployeeRepository er;

	@Test
	void testcreateEmployee() {

		Employee em = new Employee();
		em.setName("maria");

		er.save(em);
	}

}
