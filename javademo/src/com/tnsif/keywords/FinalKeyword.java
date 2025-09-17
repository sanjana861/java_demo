package com.tnsif.keywords;

final class Vehicle {
    
    final int wheels = 4;

    
    public final void displayType() {
        System.out.println("This is a Vehicle with " + wheels + " wheels.");
    }
}
public class FinalKeyword {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();

        
        System.out.println("Number of wheels: " + v.wheels);

        
        v.displayType();

        
    }
}
