package com.bmemembara.app;

public class Payment {
    String id;
    Double amount;
    String created_at;

    Registration r;

    public Payment(Registration registration, String id, Double amount, String created_at){
        r = registration;
        this.id = id;
        this.amount = amount;
        this.created_at = created_at;
    }

    public void getPaymentInformation(){
        System.out.println("---Payment Information---");
        System.out.println("ID Payment: " + this.id);
        System.out.println("ID Registration: " + r.id);
        System.out.println("Amount: " + this.amount);
        System.out.println("Payment Date: " + this.created_at);
    }
}
