package com.zipcodewilmington;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.zipcodewilmington.Person.Sex.*;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    static Person person = new Person();
    static Person person2;


    @BeforeAll
    static void setUp(){
        String birthday = "01-08-1997";
        String name= "Vera";
        Person.Sex gender = FEMALE;
        String emailAddress = "null@null.com";

        person.setBirthday(birthday);
        person.setName(name);
        person.setGender(gender);
        person.setEmailAddress("null@null.com");
        person2 = new Person("Jack","04-23-1918",MALE,emailAddress);
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
        Person.Sex expected = NON_BINARY;
        person2.setGender(expected);
        Person.Sex actual = person2.getGender();

        assertEquals(actual,expected);
    }

    @Test
    void getEmailAddress() {
        String actual = person.getEmailAddress();
        String expected = "null@null.com";
        assertEquals(actual,expected);
    }

    @Test
    void setEmailAddress() {
        String expected = "veranull@null.com";
        person.setEmailAddress(expected);
        String actual = person.getEmailAddress();

        assertEquals(actual,expected);

    }
}