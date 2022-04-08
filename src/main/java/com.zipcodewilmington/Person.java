package com.zipcodewilmington;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

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
    public Person(String name, String birthday, Sex gender, String emailAddress){
        this.name = name;
        this.birthday = LocalDate.parse(birthday, DateTimeFormatter.ofPattern("MM-dd-yyyy"));
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


//    public void printPerson() {
//        toString();
//    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setBirthday(String birthday) {
       this.birthday = LocalDate.parse(birthday, DateTimeFormatter.ofPattern("MM-dd-yyyy"));
    }
    public LocalDate getBirthday() {
        return birthday;
    }

    public Sex getGender() {
        return gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }




}
