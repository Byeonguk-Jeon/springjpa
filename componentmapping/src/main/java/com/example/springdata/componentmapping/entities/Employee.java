package com.example.springdata.componentmapping.entities;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;

@Entity
public class Employee {

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Id
	private int id;
	private String name;
	@Embedded
	private Address address;

}
