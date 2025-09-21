package com.tnsif.oopl;

public class Wrapper {
    public static void main(String[] args) {
        
        byte b = 10;
        Byte byteObj = b;   
        System.out.println("Byte object: " + byteObj);

        
        short s = 20;
        Short shortObj = s;
        System.out.println("Short object: " + shortObj);

        
        int i = 100;
        Integer intObj = i;
        System.out.println("Integer object: " + intObj);

        
        long l = 1000L;
        Long longObj = l;
        System.out.println("Long object: " + longObj);

        
        float f = 12.34f;
        Float floatObj = f;
        System.out.println("Float object: " + floatObj);

        
        double d = 123.456;
        Double doubleObj = d;
        System.out.println("Double object: " + doubleObj);

        
        char c = 'A';
        Character charObj = c;
        System.out.println("Character object: " + charObj);

       
        boolean bool = true;
        Boolean boolObj = bool;
        System.out.println("Boolean object: " + boolObj);

        
        int primitiveInt = intObj;  
        System.out.println("Unboxed int: " + primitiveInt);
    }
}

