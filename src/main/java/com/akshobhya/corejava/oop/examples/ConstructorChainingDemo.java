package com.akshobhya.corejava.oop.examples;
/**
* Demonstrates constructor chaining using super().
* Note:
* - super() must be the first statement in a constructor.
*/
public class ConstructorChainingDemo {
 
    static class Parent {
        Parent() {
            System.out.println("Parent: no-arg constructor");
        }
 
        Parent(String msg) {
            System.out.println("Parent: parameterized constructor -> " + msg);
        }
    }
 
    static class Child extends Parent {
        Child() {
            super("called from Child");
            System.out.println("Child: no-arg constructor");
        }
    }
 
    public static void main(String[] args) {
        new Child();
    }
}