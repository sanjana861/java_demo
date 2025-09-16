package com.tnsif.assignment.utilities;

import com.tnsif.assignment.employees.Employee;


public class EmployeeUtilities {

    
    public void increaseSalary(Employee emp, double percent) {
        double newSalary = emp.getSalary() + emp.getSalary() * percent / 100;
        emp.setSalary(newSalary);
        System.out.println(emp.getName() + "'s new salary: " + newSalary);
    }

    
    public void compareSalary(Employee e1, Employee e2) {
        if (e1.getSalary() > e2.getSalary()) {
            System.out.println(e1.getName() + " has a higher salary.");
        } else if (e1.getSalary() < e2.getSalary()) {
            System.out.println(e2.getName() + " has a higher salary.");
        } else {
            System.out.println("Both have the same salary.");
        }
    }
}
