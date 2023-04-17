package com.example.springdata.jpqlandnativesql;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.springdata.jpqlandnativesql.entities.Student;
import com.example.springdata.jpqlandnativesql.repos.StudentRepository;

@SpringBootTest
class JpqlandnativesqlApplicationTests {

	@Autowired
	StudentRepository repository;
	
	@Test
	public void testStudentCreate() {
		
		Student st = new Student();
		//st.setId(1L);
		st.setFirstName("John");
		st.setLastName("Ferguson");
		st.setScore(88);
		
		/*
		 * Student st1 = new Student(); st1.setFirstName("Bill");
		 * st1.setLastName("Gate"); st1.setScore(100);
		 */
		
		repository.save(st);
		//repository.save(st1);
		
	
	}

}
