package com.example.springdata.jpqlandnativesql.repos;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.springdata.jpqlandnativesql.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

	@Query("from Student")
	List<Student> findAllStudent(Pageable pageable);
	
	// 별칭(st) 사용 가능 사용 안해도 됨
	@Query("select st.firstName, st.lastName from Student st")
	List<Object[]>findAllStudentPartialData();
	
	@Query("from Student where firstName=:f")
	List<Student> findAllStudentByFirstName(@Param("f") String firstName);
	
	
	@Query("from Student where score>:min and score<:max")
	List<Student> findStudentsForGivenScores(@Param("min")int min, @Param("max")int max);
	
	@Modifying
	@Query("delete from Student where firstName =:firstName")
	void deleteStudentByFirstName(@Param("firstName") String firstName);

	@Query(value = "select * from student", nativeQuery = true)
	List<Student> findAllStudentNQ();

	@Query(value = "select * from student where fname=:firstName", nativeQuery = true)
	List<Student> findByfirstNQ(@Param("firstName") String firstName);
}
