package com.zipcodewilmington;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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
        String expected =
                "Name: " + person.name +
                "Birthday: " + person.birthday +
                "Gender: " + person.gender +
                "E-mail: " + person.emailAddress +
                "Age: "    + person.getAge();

        String actual = person.toString();

        assertEquals(actual, expected);
    }

    @Test
    void printPerson() {

    }

    @Test
    void setName() {
        String expected = "Jacky";
        person2.setName(expected);
        String actual = person2.getName();

        assertEquals(actual,expected);

    }


    @Test
    void setBirthday() {
        String date = "09-17-1912";
        person2.setBirthday(date);

        LocalDate actual = person2.getBirthday();
        LocalDate expected = LocalDate.parse(date, DateTimeFormatter.ofPattern("MM-dd-yyyy"));


        assertEquals(actual, expected);
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