package com.zipcodewilmington;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.zipcodewilmington.Person.Sex.FEMALE;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    static Person person = new Person();
    @BeforeAll
    static void setUp(){
        person.setBirthday("01-08-1997");
        person.setName("Vera");
        person.setGender(FEMALE);
        person.setEmailAddress("null@null.com");
    }



    @Test
    void getAge() {
        Person testPerson = person;

        Integer expected = 25;
        Integer actual = person.getAge();
        assertEquals(actual, expected);
    }

    @Test
    void testToString() {
    }

    @Test
    void printPerson() {
    }

    @Test
    void getName() {
    }

    @Test
    void setName() {
    }

    @Test
    void getBirthday() {
    }

    @Test
    void setBirthday() {
    }

    @Test
    void getGender() {
    }

    @Test
    void setGender() {
    }

    @Test
    void getEmailAddress() {
    }

    @Test
    void setEmailAddress() {
    }
}