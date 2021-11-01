package com.bmemembara.app;

public class Person {
    String ssn, name, birth_date, address;
    Character sex;

    public Person (String ssn, String name, Character sex, String birth_date, String address) {
        this.ssn = ssn;
        this.name = name;
        this.sex = sex;
        this.birth_date = birth_date;
        this.address = address;
    }

    public void getPersonalInformation() {
        System.out.println("---Personal Information---");
        System.out.println("SSN: " + this.ssn);
        System.out.println("Name: " + this.name);
        System.out.println("Sex: " + this.sex);
        System.out.println("Birth Date: " + this.birth_date);
        System.out.println("Address: " + this.address);
    }
}
