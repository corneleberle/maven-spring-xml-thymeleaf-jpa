package com.namics.test.sample.app.builder;

import com.namics.test.sample.app.model.Person;

public class PersonBuilder {

	private Person person = new Person();

	public PersonBuilder name(String name) {
		this.person.setName(name);
		return this;
	}

	public PersonBuilder age(Integer age) {
		this.person.setAge(age);
		return this;
	}

	public Person build() {
		return this.person;
	}

}
