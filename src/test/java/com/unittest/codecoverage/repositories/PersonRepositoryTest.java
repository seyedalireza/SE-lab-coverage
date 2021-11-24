package com.unittest.codecoverage.repositories;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import com.unittest.codecoverage.models.Person;
import org.junit.jupiter.api.Test;

class PersonRepositoryTest {

    private PersonRepository personRepository = new PersonRepository();

    @Test
    void testInsert_shouldThrowNullPointerException() {
        assertThatThrownBy(() -> personRepository.insert(null))
            .isInstanceOf(NullPointerException.class);
    }

    @Test
    void testInsert_shouldReturnInsertedPerson() {
        Person person = new Person();
        assertEquals(person, personRepository.insert(person));
    }

    @Test
    void testUpdate_shouldThrowNullPointerException() {
        assertThatThrownBy(() -> personRepository.update(null))
            .isInstanceOf(NullPointerException.class);
    }

    @Test
    void testDelete_shouldThrowNullPointerException() {
        assertThatThrownBy(() -> personRepository.delete(null))
            .isInstanceOf(NullPointerException.class);
    }

    @Test
    void testGet_shouldThrowNullPointerException() {
        assertThatThrownBy(() -> personRepository.get(null))
            .isInstanceOf(NullPointerException.class);
    }

    @Test
    void testGet_shouldReturnNullForAnyInput() {
        assertNull(personRepository.get("Hi"));
    }
}