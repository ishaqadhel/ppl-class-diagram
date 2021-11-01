package com.bmemembara.app;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("3175022002000009", "Nam Do Shaq", 'M', "20 Februari 2000", "Manggo Street 20, Boston");
        person.getPersonalInformation();

        Employee e = new Employee("3175022202190010", "Bill Harits", 'M', "22 Februari 1900", "Apple Street 21, Boston", 10000000.0, true);
        e.getEmployeeInformation();

        Nurse n = new Nurse("3175019202199011", "Seo Dal Mi", 'M', "19 Februari 1900", "Apple Street 23, Boston", 12000000.0, true, "night");
        n.getNurseInformation();
    }
}
