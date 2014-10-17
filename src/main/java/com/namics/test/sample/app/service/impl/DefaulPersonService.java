package com.namics.test.sample.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.namics.test.sample.app.builder.PersonBuilder;
import com.namics.test.sample.app.model.Person;
import com.namics.test.sample.app.service.PersonService;

@Service
public class DefaulPersonService implements PersonService {

	@Override
	public List<Person> getPeople() {
		List<Person> people = new ArrayList<Person>();
		people.add(new PersonBuilder().name("Cornel").age(29).build());
		people.add(new PersonBuilder().name("Markus").age(24).build());
		people.add(new PersonBuilder().name("Sabrina").age(27).build());
		return people;
	}

}
