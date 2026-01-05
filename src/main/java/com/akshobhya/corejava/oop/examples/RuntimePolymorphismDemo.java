package com.akshobhya.corejava.oop.examples;
 
/**
* Demonstrates runtime polymorphism using method overriding.
*/
public class RuntimePolymorphismDemo {
 
    static class Employee {
        double calculateBonus(double salary) {
            return salary * 0.10;
        }
    }
 
    static class Manager extends Employee {
        @Override
        double calculateBonus(double salary) {
            return salary * 0.20;
        }
    }
 
    public static void main(String[] args) {
        Employee emp = new Manager(); // runtime polymorphism
        System.out.println("Bonus: " + emp.calculateBonus(100000));
    }
}