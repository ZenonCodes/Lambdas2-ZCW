package com.zipcodewilmington;

import java.time.LocalDate;

public class Person {

    public Person(){
    }
    public Person(String name, LocalDate birthday, Sex gender, String emailAddress){
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this. emailAddress = emailAddress;
    }
    public enum Sex {
        MALE, FEMALE, NON_BINARY
    }

    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;

    public int getAge() {
        // ...
    }

    public void printPerson() {
        // ...
    }
}
