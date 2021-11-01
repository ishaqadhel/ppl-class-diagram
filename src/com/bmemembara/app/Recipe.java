package com.bmemembara.app;

public class Recipe {
    String medicine;

    Registration r;

    public Recipe(Registration registration, String medicine){
        r = registration;
        this.medicine = medicine;
    }

    public void getRecipeInformation(){
        System.out.println("---Recipe Information---");
        System.out.println("ID Registration: " + r.id);
        System.out.println("Medicine: " + this.medicine);
    }
}
