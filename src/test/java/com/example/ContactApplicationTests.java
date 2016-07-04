package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;



import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import static org.junit.Assert.assertEquals;

@DirtiesContext
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ContactApplication.class)
@WebAppConfiguration

public class ContactApplicationTests {
	@Autowired
	ContactRepository repository;


	@Test
	public void testQueryMethod() {

		repository.save(new Contact(1,"one"));
		repository.save(new Contact(2,"two"));
		repository.save(new Contact(3,"three"));


		List<Contact> contact = repository.findByNameNotLike("one");
		assertEquals(2, contact.size());
	}



	}
