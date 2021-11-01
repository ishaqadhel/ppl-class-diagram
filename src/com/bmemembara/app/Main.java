package com.bmemembara.app;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("3175022002000009", "Nam Do Shaq", 'M', "20 February 2000", "Manggo Street 20, Boston");
        person.getPersonalInformation();

        Employee e = new Employee("3175022202190010", "Bill Harits", 'M', "22 February 1900", "Apple Street 21, Boston", 10000000.0, true);
        e.getEmployeeInformation();

        Nurse n = new Nurse("3175021902199011", "Seo Dal Mi", 'M', "19 February 1900", "Apple Street 23, Boston", 7000000.0, true, "night");
        n.getNurseInformation();

        Doctor d = new Doctor("3175023108199919", "Seo Dal Mi", 'M', "31 August 1999", "Melon Street 09, Boston", 18000000.0, true, "dermatologis");
        d.getDoctorInformation();
    }
}
