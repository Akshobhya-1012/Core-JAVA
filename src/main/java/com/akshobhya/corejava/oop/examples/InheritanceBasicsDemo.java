package com.akshobhya.corejava.oop.examples;

/**
* Demonstrates:
* - Single inheritance
* - Multilevel inheritance
* - Hierarchical inheritance
*/
public class InheritanceBasicsDemo {
 
    // Parent class
    static class Vehicle {
        protected String brand = "Generic";
 
        public void start() {
            System.out.println("Vehicle started");
        }
    }
 
    // Single inheritance: Car extends Vehicle
    static class Car extends Vehicle {
        public void honk() {
            System.out.println("Car honks!");
        }
    }
 
    // Multilevel inheritance: ElectricCar extends Car extends Vehicle
    static class ElectricCar extends Car {
        public void charge() {
            System.out.println("Electric car charging...");
        }
    }
 
    // Hierarchical inheritance: Bike extends Vehicle
    static class Bike extends Vehicle {
        public void kickStart() {
            System.out.println("Bike kick-started!");
        }
    }
 
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.honk();
        System.out.println("Car brand: " + car.brand);
 
        System.out.println();
 
        ElectricCar ec = new ElectricCar();
        ec.start();
        ec.honk();
        ec.charge();
 
        System.out.println();
 
        Bike bike = new Bike();
        bike.start();
        bike.kickStart();
    }
}