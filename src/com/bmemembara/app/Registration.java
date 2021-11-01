package com.bmemembara.app;

public class Registration implements RegistrationDetails{
    String id;
    String reason;
    String created_at;

    private Patient p;
    private Doctor d;
    private Nurse n;

    public Registration(Patient patient, Doctor doctor, Nurse nurse, String id, String reason, String result, String created_at){
        p = patient;
        d = doctor;
        n = nurse;
        this.id = id;
        this.reason = reason;
        this.created_at = created_at;
    }

    public String getReason() {
        return ("Reason: " + this.reason);
    }

    public void getRegistrationSmallInformation(){
        System.out.println("---Registration Information---");
        System.out.println("ID Registration: " + this.id);
        System.out.println("Reason: " + this.reason);
        System.out.println("Date: " + this.created_at);
    }

    public void getRegistrationFullInformation(){
        this.getRegistrationSmallInformation();
        p.getPatientInformation();
        d.getDoctorInformation();
        n.getNurseInformation();
    }
}
