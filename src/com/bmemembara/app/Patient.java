package com.bmemembara.app;

public class Patient extends Person{
    String level;

    public Patient(String ssn, String name, Character sex, String birth_date, String address, String level) {
        super.ssn = ssn;
        super.name = name;
        super.sex = sex;
        super.birth_date = birth_date;
        super.address = address;
        this.level = level;
    }

    public void getPatientInformation(){
        System.out.println("---Patient Information---");
        System.out.println("SSN: " + super.ssn);
        System.out.println("Name: " + super.name);
        System.out.println("Sex: " + super.sex);
        System.out.println("Birth Date: " + super.birth_date);
        System.out.println("Address: " + super.address);
        System.out.println("Level: " + this.level);
    }

}
