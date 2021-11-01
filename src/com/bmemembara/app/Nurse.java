package com.bmemembara.app;

public class Nurse extends Employee{
    String shift;

    public Nurse(String ssn, String name, Character sex, String birth_date, String address, Double salary, boolean is_active, String shift) {
        super.ssn = ssn;
        super.name = name;
        super.sex = sex;
        super.birth_date = birth_date;
        super.address = address;
        super.salary = salary;
        super.is_active = is_active;
        this.shift = shift;
    }

    public void getNurseInformation(){
        System.out.println("---Nurse Information---");
        System.out.println("SSN: " + super.ssn);
        System.out.println("Name: " + super.name);
        System.out.println("Sex: " + super.sex);
        System.out.println("Birth Date: " + super.birth_date);
        System.out.println("Address: " + super.address);
        System.out.println("Salary: " + super.salary);
        System.out.println("Active Status: " + super.getEmployeeActiveStatus());
        System.out.println("Shift Time: " + this.shift);
    }
}
