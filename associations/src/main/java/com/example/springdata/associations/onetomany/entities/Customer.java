package com.example.springdata.associations.onetomany.entities;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String name;
	@OneToMany(mappedBy="customer")
	private Set<PhoneNumber> numbers;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<PhoneNumber> getNumbers() {
		return numbers;
	}
	public void setNumbers(Set<PhoneNumber> numbers) {
		this.numbers = numbers;
	}
	

	
}
