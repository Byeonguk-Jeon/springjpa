package com.example.springdata.hibernateinheritance;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Repository;

import com.example.springdata.hibernateinheritance.entities.Check;
import com.example.springdata.hibernateinheritance.entities.CreditCard;
import com.example.springdata.hibernateinheritance.repos.PaymentRepository;

@SpringBootTest
class HibernateinheritanceApplicationTests {

	@Autowired
	PaymentRepository Repository;
	
	@Test
	void contextLoads() {
	}

	@Test
	public void createPayment() {
		
		CreditCard cc = new CreditCard(); 
		cc.setId(125);
		cc.setAmount(1000);
		cc.setCardnumber("1234567890");
		Repository.save(cc);
	}
	
	@Test
	public void createCheckPayment() {
		
		Check ch = new Check(); 
		ch.setId(126);
		ch.setAmount(1000);
		ch.setChecknumber("1234567890");
		Repository.save(ch);
	}
}
