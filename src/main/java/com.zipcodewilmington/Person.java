package com.zipcodewilmington;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    public enum Sex {
        MALE, FEMALE, NON_BINARY
    }

    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;

    public Person(){
    }
    public Person(String name, LocalDate birthday, Sex gender, String emailAddress){
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this. emailAddress = emailAddress;
    }


    public int getAge() {
        Period yearsAlive = Period.between(birthday,LocalDate.now());
        return yearsAlive.getYears();
    }

    @Override
    public String toString(){
        String person =
                "Name: " + this.name +
                "Birthday: " + this.birthday +
                "Gender: " + this.gender +
                "E-mail: " + this.emailAddress +
                "Age: "    + this.getAge();
        return person;
    }


    public void printPerson() {
        toString();
    }



}
