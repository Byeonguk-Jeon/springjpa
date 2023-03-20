package com.example.springdata.product.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table //-> 객체 이름이랑 테이블 명이 동일한 경우에는 굳이 적어줄 필요 없음 
public class Product {
	
	@Id
	private int id;
	private String name;
	@Column(name="description") //->테이블 컬럼이랑 필드 변수의 이름이 다른경우 컬럼 annotation으로 정확히 적어준다
	private String des;
	private Double price;
	

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
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", des=" + des + ", price=" + price + "]";
	}
	
}
