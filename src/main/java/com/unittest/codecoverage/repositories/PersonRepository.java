package com.unittest.codecoverage.repositories;

import com.unittest.codecoverage.models.Person;
import java.util.Objects;

public class PersonRepository {
	
	public Person insert(Person person) {
		Objects.requireNonNull(person, "person can't be null");
		return person;
	}
	
	public void update(Person person) {	
		Objects.requireNonNull(person, "person can't be null");
	}
	
	public void delete(String name) {	
		Objects.requireNonNull(name, "name can't be null");
	}
	
	public Person get(String name) {
		Objects.requireNonNull(name, "name can't be null");
		return null;
	}

}
