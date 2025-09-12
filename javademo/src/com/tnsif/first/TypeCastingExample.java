package com.tnsif.first;

public class TypeCastingExample {

	public static void main(String[] args) {
		int a = 10;
        double b = a;  
        System.out.println("Implicit Casting:");
        System.out.println("Integer value: " + a);
        System.out.println("Double value (after Implicit Casting): " + b);
        
        double d= 18.0;
        int i= (int)d;
        System.out.println("Explicit Casting:");
        System.out.println("Double value: " + d);
        System.out.println("Integer value (after Explicit Casting): " + i);
	}

}
