package com.tnsif.first;

public class OperatorsExample {

	public static void main(String[] args) {
		int a=5, b=10;
		
		System.out.println("Arithmetic Operators:");
		System.out.println("a + b = "+ (a+b));
		System.out.println("a - b = " + (a - b));
	    System.out.println("a * b = " + (a * b));
	    System.out.println("a / b = " + (a / b));
	    System.out.println("a % b = " + (a % b));
	    
	    System.out.println("\nUnary Operators:");
	    System.out.println("++a = " + (++a));  
        System.out.println("b++ = " + (b++));  
        System.out.println("--a = " + (--a)); 
        System.out.println("b-- = " + (b--));  
        System.out.println("~a (bitwise NOT) = " + (~a));
        System.out.println("!(a > b) = " + (!(a > b)));
        
        System.out.println("\nAssignment Operators:");
        int x = 10;
        x += 5;  
        System.out.println("x += 5: " + x);
        x -= 3;  
        System.out.println("x -= 3: " + x);
        x *= 2;  
        System.out.println("x *= 2: " + x);
        x /= 4; 
        System.out.println("x /= 4: " + x);
        x %= 3; 
        System.out.println("x %= 3: " + x);
        
        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        
        boolean c = true, d = false;
        System.out.println("\nLogical Operators:");
        System.out.println("c && d = " + (c && d));
        System.out.println("c || d = " + (c || d));
        System.out.println("!c = " + (!c));
        
        int p = 5, q = 3;
        System.out.println("\nBitwise Operators:");
        System.out.println("p & q = " + (p & q));
        System.out.println("p | q = " + (p | q));
        System.out.println("p ^ q = " + (p ^ q));
        System.out.println("~p = " + (~p));
        System.out.println("p << 1 = " + (p << 1));
        System.out.println("p >> 1 = " + (p >> 1));
        System.out.println("p >>> 1 = " + (p >>> 1));

        int max = (a > b) ? a : b;
        System.out.println("\nTernary Operator:");
        System.out.println("Max of a and b: " + max);

        String str = "Hello";
        System.out.println("\nInstanceof Operator:");
        System.out.println("str instanceof String: " + (str instanceof String));
	}

}
