package com.example.springdata.jpqlandnativesql;

import java.util.List;

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
		// st.setId(1L);
		st.setFirstName("John");
		st.setLastName("Ferguson");
		st.setScore(88);

		repository.save(st);

	}

	@Test
	public void testFindAllStudents() {
		System.out.println(repository.findAllStudent());
	}

	@Test
	public void findAllStudentPartialData() {

		List<Object[]> list = repository.findAllStudentPartialData();

		for (Object[] obj : list) {
			System.out.println(obj[0]);

		}

	}
	
	@Test
	public void findAllStudentByFirstName() {
		System.out.println(repository.findAllStudentByFirstName("Bill"));
	}

	@Test
	public void findStudentsForGivenScores() {
		System.out.println(repository.findStudentsForGivenScores(80,90));
	}

	
}
