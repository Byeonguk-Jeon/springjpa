package com.example.springdata.idgenerators.entities;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.TableGenerator;

@Entity
public class Employee {

	public Employee(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Employee() {
		super();
	}
	
	//@TableGenerator(name="employee_gen" , table = "id_gen",pkColumnName =  "gen_name", valueColumnName = "gen_val",allocationSize=100)
	@GenericGenerator(name = "emp_id", strategy = "com.example.springdata.idgenerators.CustomRandomIDGenerator")
	@GeneratedValue(generator = "emp_id")
	@Id
	//@GeneratedValue(strategy = GenerationType.TABLE,generator = "employee_gen")
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
