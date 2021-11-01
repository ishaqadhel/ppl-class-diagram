package com.bmemembara.app;

public class Employee extends Person{
    Double salary;
    boolean is_active;

    public Employee(String ssn, String name, Character sex, String birth_date, String address, Double salary, boolean is_active) {
        super.ssn = ssn;
        super.name = name;
        super.sex = sex;
        super.birth_date = birth_date;
        super.address = address;
        this.salary = salary;
        this.is_active = is_active;
    }

    private String getEmployeeActiveStatus() {
        if(this.is_active) {
            return "Active";
        } else {
            return "Not Active";
        }
    }

    public void getEmployeeInformation(){
        System.out.println("---Employee Information---");
        System.out.println("SSN: " + super.ssn);
        System.out.println("Name: " + super.name);
        System.out.println("Sex: " + super.sex);
        System.out.println("Birth Date: " + super.birth_date);
        System.out.println("Address: " + super.address);
        System.out.println("Salary: " + this.salary);
        System.out.println("Active Status: " + this.getEmployeeActiveStatus());
    }
}
