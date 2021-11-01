package com.bmemembara.app;

public class Main {
    public static void main(String[] args) {
        Doctor d = new Doctor("3175023108199919", "Nam Do Shaq", 'M', "31 August 1999", "Melon Street 09, Boston", 18000000.0, true, "Heart Specialist");
        Nurse n = new Nurse("3175021902199011", "Seo Dal Mi", 'W', "19 February 1990", "Apple Street 23, Boston", 7000000.0, true, "night");
        Patient p = new Patient("3175022202190010", "Bill Harits", 'M', "22 February 1900", "Apple Street 21, Boston", "Bronze");
        MedicalHistory m = new MedicalHistory(p, "819e825b-1326-4a67-9006-6d0e67e8b557", "Diabetes Melitus", 1);
        Registration r = new Registration(p, d, n, "ca4eee86-42e5-4493-b690-f44c3c6083c0", "Headache", "Go Home", "31 October 2021");

        m.getMedicalHistory();
        r.getRegistrationFullInformation();
    }
}
