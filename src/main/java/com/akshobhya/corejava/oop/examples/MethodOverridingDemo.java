package com.akshobhya.corejava.oop.examples;
 
/**
* Demonstrates method overriding and runtime polymorphism (dynamic dispatch).
*/
public class MethodOverridingDemo {
 
    static class Employee {
        public double calculateBonus(double salary) {
            return salary * 0.10;
        }
    }
 
    static class Manager extends Employee {
        @Override
        public double calculateBonus(double salary) {
            double base = super.calculateBonus(salary);
            return base + (salary * 0.05);
        }
    }
 
    public static void main(String[] args) {
        Employee e1 = new Employee();
        System.out.println("Employee bonus: " + e1.calculateBonus(100000));
 
        // Runtime polymorphism: reference is Employee, object is Manager
        Employee e2 = new Manager();
        System.out.println("Manager bonus: " + e2.calculateBonus(100000));
    }
}