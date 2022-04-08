package com.zipcodewilmington;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Person person = new Person();
    @BeforeAll
    public void init(){
        person.setBirthday(1997,01,08);
    }



    @Test
    void getAge() {

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