package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;



import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ContactApplication.class)
@WebAppConfiguration

public class ContactApplicationTests {
	@Autowired
	ContactRepository repository;




	@Test
	public void testQueryMethod() {


		//List<Contact> list = new CopyOnWriteArrayList<Contact>();

		//Iterable<Contact> contact = repository.findAll();
		List<Contact> contact = repository.findByNameNotLike("one");

//		for (Contact customer : contact) {
//
//			list.add(customer);
//		}
		assertEquals(4, contact.size());
	}



	}
