package com.tnsif.constructor;


class Student {
 int id;
 String name;

 // Default Constructor
 Student() {
     id = 0;
     name = "Unknown";
     System.out.println("Default Constructor called");
 }

 // Parameterized Constructor
 Student(int i, String n) {
     id = i;
     name = n;
     System.out.println("Parameterized Constructor called");
 }

 void display() {
     System.out.println("ID: " + id + ", Name: " + name);
 }
}

public class Constructor {
   public static void main(String[] args) {
     Student s1 = new Student();
     s1.display();

     // Object created using parameterized constructor
     Student s2 = new Student(101, "Alice");
     s2.display();
 }
}

