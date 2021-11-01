package com.bmemembara.app;

public class MedicalHistory {
    String id;
    String name;
    int level;

    private Patient p;

    public MedicalHistory(Patient patient, String id, String name, int level) {
        p = patient;
        this.id = id;
        this.name = name;
        this.level = level;
    }

    public void getMedicalHistory() {
        System.out.println("---Patient Medical History Information---");
        System.out.println("ID Medical History: " + this.id);
        System.out.println("SSN: " + p.ssn);
        System.out.println("Name: " + p.name);
        System.out.println("Sex: " + p.sex);
        System.out.println("Birth Date: " + p.birth_date);
        System.out.println("Sickness Name: " + this.name);
        System.out.println("Sickness Level: " + this.level);
    }
}
