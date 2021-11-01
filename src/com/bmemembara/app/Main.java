package com.bmemembara.app;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("3175022002000009", "Nam Do Shaq", 'M', "20 Februari 2000", "Manggo Street 20, Boston");
        person.getPersonalInformation();

        Employee e = new Employee("3175022002000009", "Nam Do Shaq", 'M', "20 Februari 2000", "Manggo Street 20, Boston", 10000000.0, true);
        e.getEmployeeInformation();
    }
}
