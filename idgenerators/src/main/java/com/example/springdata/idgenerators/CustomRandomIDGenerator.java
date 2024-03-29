package com.example.springdata.idgenerators;

import java.util.Random;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class CustomRandomIDGenerator implements IdentifierGenerator {

	@Override
	public Object generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		Random random = null;
		int id = 0;
		random = new Random();
		id = random.nextInt(1000000);
		return new Long(id);
	}

}
