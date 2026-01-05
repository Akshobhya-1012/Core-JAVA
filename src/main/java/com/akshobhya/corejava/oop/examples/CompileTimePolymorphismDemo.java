package com.akshobhya.corejava.oop.examples;
 
/**
* Demonstrates compile-time polymorphism using method overloading.
*/
public class CompileTimePolymorphismDemo {
 
    static class Calculator {
 
        int add(int a, int b) {
            return a + b;
        }
 
        int add(int a, int b, int c) {
            return a + b + c;
        }
 
        double add(double a, double b) {
            return a + b;
        }
    }
 
    public static void main(String[] args) {
        Calculator calc = new Calculator();
 
        System.out.println(calc.add(10, 20));
        System.out.println(calc.add(10, 20, 30));
        System.out.println(calc.add(5.5, 4.5));
    }
}